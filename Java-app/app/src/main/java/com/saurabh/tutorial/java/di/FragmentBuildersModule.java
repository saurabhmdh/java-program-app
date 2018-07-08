package com.saurabh.tutorial.java.di;

import com.saurabh.tutorial.java.view.fragments.HomepageFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract HomepageFragment contributeSearchFragment();
}