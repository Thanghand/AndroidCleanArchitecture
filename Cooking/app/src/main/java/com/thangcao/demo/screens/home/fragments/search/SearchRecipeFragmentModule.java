package com.thangcao.demo.screens.home.fragments.search;

import com.thangcao.demo.repositories.RecipeRepository;
import com.thangcao.demo.repositories.recipe.RecipeRepositoryImpl;
import com.thangcao.demo.repositories.recipe.cloud.RecipeCloud;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public abstract class SearchRecipeFragmentModule {

    // Cloud
    @Provides
    static RecipeCloud provideRecipeCloud(Retrofit retrofit) {
        return new RecipeCloud(retrofit);
    }

    // Repository
    @Binds
    abstract RecipeRepository provideRecipeRepository(RecipeRepositoryImpl recipeRepository);
}
