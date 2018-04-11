package com.thangcao.cooking.interactors.recipe

import com.thangcao.cooking.common.base.executor.PostExecutionThread
import com.thangcao.cooking.common.base.executor.ThreadExecutor
import com.thangcao.cooking.repositories.RecipeRepository
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner.class)
class SearchRecipesTest {

    @Mock private ThreadExecutor mockThreadExecutor;
    @Mock private PostExecutionThread mockPostExecutionThread;
    @Mock private RecipeRepository recipeRepository;


}
