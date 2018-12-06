package org.alaaeddin.twittersearchapp.utils;

import android.app.Application;
import android.content.Context;

import org.alaaeddin.twittersearchapp.di.component.ApplicationComponent;
import org.alaaeddin.twittersearchapp.di.component.DaggerApplicationComponent;

public class TSApplication extends Application {

    private ApplicationComponent component;
    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.create();
    }

    public static ApplicationComponent getApplicationComponent(Context context){
        return ((TSApplication)context.getApplicationContext()).component;
    }
}
