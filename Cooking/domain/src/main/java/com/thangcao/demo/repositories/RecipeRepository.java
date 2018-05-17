package com.thangcao.demo.repositories;


import com.thangcao.demo.common.models.Recipe;
import com.thangcao.demo.common.models.params.ParamsOfFilterRecipes;
import com.thangcao.demo.common.models.params.ParamsOfSearchRecipes;

import java.util.List;

import io.reactivex.Observable;

public interface RecipeRepository {
    Observable<List<Recipe>> searchRecipes(ParamsOfSearchRecipes paramsOfSearchRecipes, int page);

    Observable<List<Recipe>> filterRecipes(ParamsOfFilterRecipes paramsOfFilterRecipes, int page);
}
