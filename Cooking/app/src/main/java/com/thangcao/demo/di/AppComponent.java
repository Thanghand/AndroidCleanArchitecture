package com.thangcao.demo.di;

import android.app.Application;

import com.thangcao.demo.MyAndroidApplication;
import com.thangcao.demo.di.modules.ActivityBuilder;
import com.thangcao.demo.di.modules.ApplicationModule;
import com.thangcao.demo.di.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ApplicationModule.class,
        NetworkModule.class,
        ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    void inject(MyAndroidApplication app);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}