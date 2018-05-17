package com.thangcao.demo.di.modules;

import com.thangcao.demo.screens.home.HomeActivity;
import com.thangcao.demo.screens.home.HomeActivityModule;
import com.thangcao.demo.screens.home.HomeFragmentProvider;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {HomeActivityModule.class, HomeFragmentProvider.class})
    abstract HomeActivity bindHomeActivity();

}
