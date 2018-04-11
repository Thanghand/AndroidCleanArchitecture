package com.thangcao.cooking.di.modules;

import com.thangcao.cooking.screens.home.HomeActivity;
import com.thangcao.cooking.screens.home.HomeActivityModule;
import com.thangcao.cooking.screens.home.HomeFragmentProvider;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {HomeActivityModule.class, HomeFragmentProvider.class})
    abstract HomeActivity bindHomeActivity();

}
