package org.alaaeddin.twittersearchapp.di.annotation;

import android.arch.lifecycle.ViewModel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import dagger.MapKey;

@MapKey // So we have to add this annotation.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ViewModelKey {

    // This annotation will have a value of class that extends a view model.
    Class<? extends ViewModel> value();
}
