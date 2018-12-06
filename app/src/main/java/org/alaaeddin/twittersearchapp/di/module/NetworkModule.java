package org.alaaeddin.twittersearchapp.di.module;

import org.alaaeddin.twittersearchapp.service.repository.TwitterService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Module // Tells dagger this class is a module
public abstract class NetworkModule {

    @Provides  // This will be used throughout
    @Singleton // the lifecycle of our app
    static Retrofit provideRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(TwitterService.BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build();
    }
}
