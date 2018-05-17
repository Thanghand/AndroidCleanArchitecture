package com.thangcao.demo;

import com.thangcao.demo.common.base.executor.PostExecutionThread;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class UIThread implements PostExecutionThread {

    @Inject
    UIThread(){}

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
