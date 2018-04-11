package com.thangcao.cooking.interactors.recipe;

import com.thangcao.cooking.common.base.executor.PostExecutionThread;
import com.thangcao.cooking.common.base.executor.ThreadExecutor;
import com.thangcao.cooking.common.base.usecase.UseCaseThread;
import com.thangcao.cooking.common.models.Recipe;
import com.thangcao.cooking.common.models.params.ParamsOfSearchRecipes;
import com.thangcao.cooking.repositories.RecipeRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;


public class SearchRecipes extends UseCaseThread<ParamsOfSearchRecipes, List<Recipe>> {

    private int currentPage = 1;

    // Declare Repository
    private final RecipeRepository recipeRepository;

    @Inject
    SearchRecipes(ThreadExecutor threadExecutor,
                  PostExecutionThread postExecutionThread,
                  RecipeRepository recipeRepository) {
        super(threadExecutor, postExecutionThread);
        this.recipeRepository = recipeRepository;
    }

    @Override
    protected Observable<List<Recipe>> buildUseCaseObservable(ParamsOfSearchRecipes params) {
        switch (params.getLoadState()){
            case NEW:
                currentPage = 1;
                break;
            case MORE:
                currentPage++;
                break;
        }
        return recipeRepository.searchRecipes(params, currentPage);
    }
}
