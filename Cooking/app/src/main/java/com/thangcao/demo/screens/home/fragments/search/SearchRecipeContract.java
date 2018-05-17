package com.thangcao.demo.screens.home.fragments.search;

import com.thangcao.demo.common.base.presenter.IPresenter;
import com.thangcao.demo.common.base.viewlistener.ViewCallback;
import com.thangcao.demo.common.models.RecipeViewModel;
import com.thangcao.demo.common.models.params.ParamsOfFilterRecipes;
import com.thangcao.demo.common.models.params.ParamsOfSearchRecipes;

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
