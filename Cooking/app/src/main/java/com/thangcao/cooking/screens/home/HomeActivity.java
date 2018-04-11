package com.thangcao.cooking.screens.home;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.thangcao.cooking.R;
import com.thangcao.cooking.common.base.ui.BaseActivity;
import com.thangcao.cooking.screens.home.fragments.search.SearchRecipeFragment;

public class HomeActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null){
            Bundle args = new Bundle();
            SearchRecipeFragment searchRecipeFragment = new SearchRecipeFragment();
            searchRecipeFragment.setArguments(args);

            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.container_fragment, searchRecipeFragment)
                    .commitAllowingStateLoss();
        }
    }
}
