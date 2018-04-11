package com.thangcao.cooking.repositories.recipe.cloud;


import com.thangcao.cooking.common.base.cloud.BaseRetrofitCloud;
import com.thangcao.cooking.common.models.response.RecipeResponse;

import javax.inject.Inject;

import io.reactivex.Observable;
import retrofit2.Retrofit;

public class RecipeCloud extends BaseRetrofitCloud implements RecipeApi {

    @Inject
    public RecipeCloud(Retrofit retrofit) {
        super(retrofit);
    }

    @Override
    public Observable<RecipeResponse> findRecipes(String category, int page) {
        return getRetrofit()
                .create(RecipeApi.class)
                .findRecipes(category, page);
    }
}
