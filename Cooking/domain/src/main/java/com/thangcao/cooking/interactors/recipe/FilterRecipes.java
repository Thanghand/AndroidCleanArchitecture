package com.thangcao.cooking.interactors.recipe;

import com.thangcao.cooking.common.base.executor.PostExecutionThread;
import com.thangcao.cooking.common.base.executor.ThreadExecutor;
import com.thangcao.cooking.common.base.usecase.UseCaseThread;
import com.thangcao.cooking.common.models.Recipe;
import com.thangcao.cooking.common.models.params.ParamsOfFilterRecipes;
import com.thangcao.cooking.repositories.RecipeRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class FilterRecipes extends UseCaseThread<ParamsOfFilterRecipes, List<Recipe>> {

    private int currentPage = 1;

    // Declare Repository
    private final RecipeRepository recipeRepository;

    @Inject
    FilterRecipes(ThreadExecutor threadExecutor,
                  PostExecutionThread postExecutionThread,
                  RecipeRepository recipeRepository) {
        super(threadExecutor, postExecutionThread);
        this.recipeRepository = recipeRepository;
    }

    @Override
    protected Observable<List<Recipe>> buildUseCaseObservable(ParamsOfFilterRecipes params) {
        switch (params.getLoadState()) {
            case NEW:
                currentPage = 1;
                break;
            case MORE:
                currentPage++;
                break;
        }
        return recipeRepository.filterRecipes(params, currentPage);
    }
}
