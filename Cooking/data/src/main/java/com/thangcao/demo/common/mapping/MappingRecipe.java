package com.thangcao.demo.common.mapping;

import com.thangcao.demo.common.models.Recipe;
import com.thangcao.demo.common.models.response.RecipeResponse;

import java.util.Collections;
import java.util.List;


public class MappingRecipe {

    public static List<Recipe> mapListRecipeFromResponse(RecipeResponse recipeResponse){
        return  Collections.unmodifiableList(recipeResponse.getData());
    }
}
