package org.alaaeddin.twittersearchapp.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import org.alaaeddin.twittersearchapp.service.model.Status;
import org.alaaeddin.twittersearchapp.service.model.TwitterResponse;
import org.alaaeddin.twittersearchapp.service.repository.TwitterRepository;

import java.util.List;

// ViewModel class calls the Repository API, In order to consume getTweets()
public class ListViewModel extends ViewModel {
    private LiveData<TwitterResponse> responseLiveData;
    private LiveData<List<Status>> statusListObservable;
    private LiveData<Boolean> statusesLoadError ;
    private LiveData<Boolean> loading;
    TwitterRepository twitterRepository = TwitterRepository.getInstance();

    public ListViewModel() {
    }

    /**
     * Expose the LiveData 'Status query' so the UI can observe it.
     */
    public LiveData<List<Status>> getStatusList(String query) {
        return statusListObservable = twitterRepository.getStatuses(query);
    }

    /**
     * Expose the LiveData 'Status List Load Error' so the UI can observe it.
     */
    public LiveData<Boolean> getStatusesLoadErrorObservable() {
        return statusesLoadError = twitterRepository.getError();
    }

    /**
     * Expose the LiveData 'Status List Loading' so the UI can observe it.
     */
    public LiveData<Boolean> getLoadingObservable() {
        return  loading = twitterRepository.getLoading();
    }
}
