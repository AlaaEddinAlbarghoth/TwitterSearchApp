package org.alaaeddin.twittersearchapp.service.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;
import android.widget.Toast;

import org.alaaeddin.twittersearchapp.service.model.Status;
import org.alaaeddin.twittersearchapp.service.model.TwitterResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

// This class is created to interact with 'TwitterService' and to finally provide a LiveData object for ViewModel,
// In order to facilitate its Job.
public class TwitterRepository {

    private static TwitterService twitterService;
    private Call<TwitterResponse> twitterResponseCall;

    private final MutableLiveData<List<Status>> statuses = new MutableLiveData<>();
    private final MutableLiveData<Boolean> statusesLoadError = new MutableLiveData<>(); //  It will be used if there is an error loading the tweets.
    private final MutableLiveData<Boolean> loading = new MutableLiveData<>(); // It will tell our view whether the data is loading or not.

    public TwitterRepository(Retrofit retrofit) {
        twitterService = retrofit.create(TwitterService.class);
    }

    // Expose it as simply live data the view won't be able to call setValue found MutableLiveData.
    public LiveData<List<Status>> getStatuses(String query) {
        fetchStatuses(query);
        return statuses;
    }

    public LiveData<Boolean> getError() {
        return statusesLoadError;
    }

    public LiveData<Boolean> getLoading() {
        return loading;
    }

    // Retrieving data from server.
    private void fetchStatuses(String query) {
        loading.setValue(true);
        twitterResponseCall = twitterService.getTwitterResponse(query);
        Log.i(getClass().getSimpleName(), "fetchPosts !");
        twitterResponseCall.enqueue(new Callback<TwitterResponse>() {
            @Override
            public void onResponse(Call<TwitterResponse> call, Response<TwitterResponse> response) {
                statusesLoadError.setValue(false);
                statuses.setValue(response.body().getStatuses());
                loading.setValue(false);
                twitterResponseCall = null;
            }

            @Override
            public void onFailure(Call<TwitterResponse> call, Throwable t) {
                statusesLoadError.setValue(true);
                loading.setValue(false);
                Log.e(getClass().getSimpleName(), "Error loading posts", t);
                twitterResponseCall = null;
            }
        });
    }

    // Clear Data to avoid leaking in memory, fragment is no longer in the back stack are being displayed.
    public void clearData() {
        if (twitterResponseCall != null) {
            twitterResponseCall.cancel();
            twitterResponseCall = null;
        }
    }
}
