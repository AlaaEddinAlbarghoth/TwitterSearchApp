package org.alaaeddin.twittersearchapp.di.component;

import org.alaaeddin.twittersearchapp.di.module.NetworkModule;
import org.alaaeddin.twittersearchapp.di.module.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton // Scope annotation
@Component ( modules = {
        NetworkModule.class, // This component it can retrieve dependencies from this module.
        ViewModelModule.class,
}) // Tells dagger this interface is a component
public interface ApplicationComponent {
}
