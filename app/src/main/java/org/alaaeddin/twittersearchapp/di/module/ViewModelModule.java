package org.alaaeddin.twittersearchapp.di.module;

import android.arch.lifecycle.ViewModel;

import org.alaaeddin.twittersearchapp.di.annotation.ViewModelKey;
import org.alaaeddin.twittersearchapp.viewmodel.ListViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

//  This is the module that provides viewModel map value
@Module
public abstract class ViewModelModule {

    // The argument for the method is the implementation that we want to return.
    @Binds
    @IntoMap
    @ViewModelKey(ListViewModel.class)
    abstract ViewModel bindListViewModel(ListViewModel listViewModel);
}
