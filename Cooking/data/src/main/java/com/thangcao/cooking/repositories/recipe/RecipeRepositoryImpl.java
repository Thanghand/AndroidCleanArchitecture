package com.thangcao.cooking.repositories.recipe;


import com.thangcao.cooking.common.mapping.MappingRecipe;
import com.thangcao.cooking.common.models.Recipe;
import com.thangcao.cooking.common.models.params.ParamsOfFilterRecipes;
import com.thangcao.cooking.common.models.params.ParamsOfSearchRecipes;
import com.thangcao.cooking.repositories.RecipeRepository;
import com.thangcao.cooking.repositories.recipe.cloud.RecipeCloud;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class RecipeRepositoryImpl implements RecipeRepository {

    private final RecipeCloud recipeCloud;

    @Inject
    RecipeRepositoryImpl(RecipeCloud recipeCloud) {
        this.recipeCloud = recipeCloud;
    }

    @Override
    public Observable<List<Recipe>> searchRecipes(ParamsOfSearchRecipes paramsOfSearchRecipes, int page) {
        return recipeCloud
                .findRecipes(paramsOfSearchRecipes.getCategory(), page)
                .map(MappingRecipe::mapListRecipeFromResponse);
    }

    @Override
    public Observable<List<Recipe>> filterRecipes(ParamsOfFilterRecipes paramsOfFilterRecipes, int page) {
        return recipeCloud
                .findRecipes(paramsOfFilterRecipes.getCategory(), page)
                .map(MappingRecipe::mapListRecipeFromResponse);
    }
}
