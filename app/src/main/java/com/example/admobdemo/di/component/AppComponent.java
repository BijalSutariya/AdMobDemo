package com.example.admobdemo.di.component;

import android.app.Application;

import com.example.admobdemo.App;
import com.example.admobdemo.di.module.MainActivityModule;
import com.example.admobdemo.di.module.ViewModelModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {ViewModelModule.class,
        MainActivityModule.class,
        AndroidSupportInjectionModule.class})
@Singleton
public interface AppComponent {

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
    void inject(App app);
}
