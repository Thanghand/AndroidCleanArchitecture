package com.thangcao.demo.common.mapping;

import com.thangcao.demo.common.models.Recipe;
import com.thangcao.demo.common.models.RecipeViewModel;

import java.util.ArrayList;
import java.util.List;

public class MappingRecipeViewModel {

    public static List<RecipeViewModel> mapRecipesToViewModels(List<Recipe> recipes){
        List<RecipeViewModel> recipeViewModels = new ArrayList<>();
        for (Recipe recipe: recipes){
            recipeViewModels.add(mapRecipeToViewModel(recipe));
        }
        return recipeViewModels;
    }

    public static RecipeViewModel mapRecipeToViewModel(Recipe recipe){
        RecipeViewModel recipeViewModel = new RecipeViewModel();
        recipeViewModel.setId(recipe.getId());
        recipeViewModel.setAvgRating(recipe.getAvgRating());
        recipeViewModel.setImg(recipe.getImg());
        recipeViewModel.setCategory(recipe.getCategory());
        recipeViewModel.setName(recipe.getName());
        recipeViewModel.setTotalReviews(recipe.getTotalReviews());
        return recipeViewModel;
    }
}
