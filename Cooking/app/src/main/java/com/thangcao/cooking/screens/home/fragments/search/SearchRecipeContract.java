package com.thangcao.cooking.screens.home.fragments.search;

import com.thangcao.cooking.common.base.presenter.IPresenter;
import com.thangcao.cooking.common.base.viewlistener.ViewCallback;
import com.thangcao.cooking.common.models.RecipeViewModel;
import com.thangcao.cooking.common.models.params.LoadState;
import com.thangcao.cooking.common.models.params.ParamsOfFilterRecipes;
import com.thangcao.cooking.common.models.params.ParamsOfSearchRecipes;

import java.util.List;

public interface SearchRecipeContract {

    interface Presenter extends IPresenter {
        void searchRecipes(ParamsOfSearchRecipes paramsOfSearchRecipes);

        void filterRecipes(ParamsOfFilterRecipes paramsOfFilterRecipes);
    }

    interface ViewRecipeCallBack extends ViewCallback {
        void renderRecipes(List<RecipeViewModel> recipeViewModels);

        void renderRecipesError(String error);
    }
}
