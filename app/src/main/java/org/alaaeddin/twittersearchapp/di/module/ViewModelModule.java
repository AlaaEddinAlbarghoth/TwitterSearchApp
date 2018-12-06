package org.alaaeddin.twittersearchapp.di.module;

import android.arch.lifecycle.ViewModel;

import org.alaaeddin.twittersearchapp.di.annotation.ViewModelKey;
import org.alaaeddin.twittersearchapp.viewmodel.ListViewModel;

import dagger.Binds;
import dagger.multibindings.IntoMap;

public abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(ListViewModel.class)
    abstract ViewModel bindListViewModel(ListViewModel listViewModel);
}
