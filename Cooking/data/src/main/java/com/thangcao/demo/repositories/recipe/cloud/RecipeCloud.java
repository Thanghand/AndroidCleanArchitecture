package com.thangcao.demo.repositories.recipe.cloud;


import com.thangcao.demo.common.base.cloud.BaseRetrofitCloud;
import com.thangcao.demo.common.models.response.RecipeResponse;

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
