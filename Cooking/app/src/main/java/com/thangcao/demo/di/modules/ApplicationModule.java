package com.thangcao.demo.di.modules;

import android.app.Application;
import android.content.Context;

import com.thangcao.demo.UIThread;
import com.thangcao.demo.common.base.executor.JobExecutor;
import com.thangcao.demo.common.base.executor.PostExecutionThread;
import com.thangcao.demo.common.base.executor.ThreadExecutor;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ApplicationModule {

    @Binds
    abstract Context provideContext(Application application);

    @Provides
    @Singleton
    static ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
        return jobExecutor;
    }

    @Provides
    @Singleton
    static PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }

}
