package com.thangcao.cooking.common.base.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        initToolbar();
        initView();
    }

    protected  void initView(){}

    protected void initToolbar() {}

    protected abstract int getContentView();
}
