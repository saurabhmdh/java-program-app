package com.saurabh.tutorial.java.di;

import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.saurabh.tutorial.java.viewmodel.ApplicationViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
abstract class ViewModelModule {
//    @Binds
//    @IntoMap
//    @ViewModelKey(UserViewModel.class)
//    abstract ViewModel bindUserViewModel(UserViewModel userViewModel);
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(SearchViewModel.class)
//    abstract ViewModel bindSearchViewModel(SearchViewModel searchViewModel);
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(RepoViewModel.class)
//    abstract ViewModel bindRepoViewModel(RepoViewModel repoViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ApplicationViewModelFactory factory);
}
