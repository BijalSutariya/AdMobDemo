package com.example.admobdemo.di.module;

import com.example.admobdemo.factory.ListViewModelFactory;

import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelModule {
    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ListViewModelFactory listViewModelFactory);


}
