package com.thangcao.cooking.screens.home.fragments.search;


import com.thangcao.cooking.common.base.output.OutputObserver;
import com.thangcao.cooking.common.base.presenter.BasePresenter;
import com.thangcao.cooking.common.mapping.MappingRecipeViewModel;
import com.thangcao.cooking.common.models.Recipe;
import com.thangcao.cooking.common.models.RecipeViewModel;
import com.thangcao.cooking.common.models.params.LoadState;
import com.thangcao.cooking.common.models.params.ParamsOfFilterRecipes;
import com.thangcao.cooking.common.models.params.ParamsOfSearchRecipes;
import com.thangcao.cooking.interactors.recipe.FilterRecipes;
import com.thangcao.cooking.interactors.recipe.SearchRecipes;

import java.util.List;

import javax.inject.Inject;

public class SearchRecipePresenter extends BasePresenter<SearchRecipeContract.ViewRecipeCallBack>
        implements SearchRecipeContract.Presenter {

    private final SearchRecipes searchRecipes;

    private final FilterRecipes filterRecipes;

    @Inject
    SearchRecipePresenter(SearchRecipes searchRecipes, FilterRecipes filterRecipes) {
        super(searchRecipes, filterRecipes);
        this.searchRecipes = searchRecipes;
        this.filterRecipes = filterRecipes;
    }

    @Override
    public void searchRecipes(ParamsOfSearchRecipes paramsOfSearchRecipes) {
        searchRecipes.execute(paramsOfSearchRecipes, new OutputRecipes());
    }

    @Override
    public void filterRecipes(ParamsOfFilterRecipes paramsOfFilterRecipes) {
        filterRecipes.execute(paramsOfFilterRecipes, new OutputRecipes());
    }

    private final class OutputRecipes extends OutputObserver<List<Recipe>> {
        @Override
        public void onNext(List<Recipe> recipes) {
            if (getViewCallback() == null) return;
            List<RecipeViewModel> recipeViewModels = MappingRecipeViewModel.mapRecipesToViewModels(recipes);
            getViewCallback().renderRecipes(recipeViewModels);
        }

        @Override
        public void onError(Throwable exception) {
            if (getViewCallback() == null) return;
            getViewCallback().renderRecipesError(exception.getMessage());
        }
    }
}
