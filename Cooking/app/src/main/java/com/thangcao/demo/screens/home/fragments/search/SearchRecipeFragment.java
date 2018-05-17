package com.thangcao.demo.screens.home.fragments.search;


import android.util.Log;

import com.thangcao.cooking.R;
import com.thangcao.demo.common.base.ui.BaseFragment;
import com.thangcao.demo.common.models.RecipeViewModel;
import com.thangcao.demo.common.models.params.LoadState;
import com.thangcao.demo.common.models.params.ParamsOfSearchRecipes;

import java.util.List;

import javax.inject.Inject;

public class SearchRecipeFragment extends BaseFragment implements SearchRecipeContract.ViewRecipeCallBack {

    private static final String TAG = SearchRecipeFragment.class.getSimpleName();

    @Inject
    SearchRecipePresenter searchRecipePresenter;

    @Override
    protected int getContentView() {
        return R.layout.fragment_search_recipe;
    }

    @Override
    protected void setViewCallbackForPresenter() {
        searchRecipePresenter.setViewCallback(this);
    }

    @Override
    protected void runBusiness() {
        super.runBusiness();
        callSearchRecipeExample();
    }

    @Override
    public void renderRecipes(List<RecipeViewModel> recipeViewModels) {
        Log.d(TAG, "Size of recipeViewModels: " + recipeViewModels.size());
    }

    @Override
    public void renderRecipesError(String error) {
        Log.e(TAG, "Error of recipeViewModels: " + error);
    }

    // TODO: This function will be removed
    private void callSearchRecipeExample() {
        String keyword = "Thit";
        String category = "Chay";

        ParamsOfSearchRecipes paramsOfSearchRecipes = new ParamsOfSearchRecipes();
        paramsOfSearchRecipes.setKeyword(keyword);
        paramsOfSearchRecipes.setCategory(category);
        paramsOfSearchRecipes.setLoadState(LoadState.NEW);
        searchRecipePresenter.searchRecipes(paramsOfSearchRecipes);
    }
}
