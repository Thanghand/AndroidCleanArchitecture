package com.thangcao.cooking.repositories.recipe.cloud;

import com.thangcao.cooking.common.models.response.RecipeResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface RecipeApi {

    @GET("recipe/{category}/{page}")
    Observable<RecipeResponse> findRecipes(@Path("category") String category, @Path("page") int page);

}
