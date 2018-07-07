package com.saurabh.tutorial.java.di;

import android.app.Application;
import android.arch.persistence.room.Room;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = ViewModelModule.class)
class AppModule {
//    @Singleton
//    @Provides
//    GithubService provideGithubService() {
//        return new Retrofit.Builder()
//                .baseUrl("https://api.github.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(new LiveDataCallAdapterFactory())
//                .build()
//                .create(GithubService.class);
//    }
//
//    @Singleton @Provides
//    GithubDb provideDb(Application app) {
//        return Room.databaseBuilder(app, GithubDb.class,"github.db").build();
//    }
//
//    @Singleton @Provides
//    UserDao provideUserDao(GithubDb db) {
//        return db.userDao();
//    }
//
//    @Singleton @Provides
//    RepoDao provideRepoDao(GithubDb db) {
//        return db.repoDao();
//    }
}