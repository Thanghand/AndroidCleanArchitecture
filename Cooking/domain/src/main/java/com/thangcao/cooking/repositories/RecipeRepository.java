package com.thangcao.cooking.repositories;


import com.thangcao.cooking.common.models.Recipe;
import com.thangcao.cooking.common.models.params.ParamsOfFilterRecipes;
import com.thangcao.cooking.common.models.params.ParamsOfSearchRecipes;

import java.util.List;

import io.reactivex.Observable;

public interface RecipeRepository {
    Observable<List<Recipe>> searchRecipes(ParamsOfSearchRecipes paramsOfSearchRecipes, int page);

    Observable<List<Recipe>> filterRecipes(ParamsOfFilterRecipes paramsOfFilterRecipes, int page);
}
