package com.thangcao.cooking.common.base.presenter;

import com.thangcao.cooking.common.base.viewlistener.ViewCallback;

public interface IPresenter {
    void onStop();

    void onCreate();

    void onRestart();

    void onDestroy();
}
