package com.thangcao.demo.screens.home;

import com.thangcao.demo.screens.home.fragments.search.SearchRecipeFragment;
import com.thangcao.demo.screens.home.fragments.search.SearchRecipeFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class HomeFragmentProvider {

    @ContributesAndroidInjector(modules = SearchRecipeFragmentModule.class)
    abstract SearchRecipeFragment provideSearchRecipeFragmentFactory();

}

