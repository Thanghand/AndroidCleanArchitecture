package com.thangcao.demo.common.base.presenter;


import com.thangcao.demo.common.base.usecase.UseCaseThread;
import com.thangcao.demo.common.base.viewlistener.ViewCallback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BasePresenter<V extends ViewCallback> implements IPresenter{

    private List<UseCaseThread> useCaseThreads;
    private V viewCallback;

    public BasePresenter(UseCaseThread... useCaseThreads){
        this.useCaseThreads = new ArrayList<>();
        this.useCaseThreads.addAll(Arrays.asList(useCaseThreads));
    }

    @Override
    public void onStop(){}

    @Override
    public void onCreate(){}

    @Override
    public void onRestart(){}

    @Override
    public void onDestroy(){
        for (UseCaseThread useCaseThread : useCaseThreads){
            useCaseThread.dispose();
        }
        viewCallback = null;
    }

    public void setViewCallback(V viewCallback){
        this.viewCallback = viewCallback;
    }

    public V getViewCallback(){
        return viewCallback;
    }
}
