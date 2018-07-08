package com.saurabh.tutorial.java.di;

import com.saurabh.tutorial.java.view.activity.HomePage;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract HomePage contributeMainActivity();
}
