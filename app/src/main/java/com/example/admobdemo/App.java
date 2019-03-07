package com.example.admobdemo;

import android.app.Activity;
import android.app.Application;

import com.example.admobdemo.di.component.DaggerAppComponent;
import com.google.android.gms.ads.MobileAds;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import timber.log.Timber;

public class App extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());

        MobileAds.initialize(this,"ca-app-pub-5650991083480726~2565728402");
        DaggerAppComponent.builder().application(this).build().inject(this);
    }
}
