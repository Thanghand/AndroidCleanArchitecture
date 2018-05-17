package com.thangcao.demo.common.base.output;

import io.reactivex.observers.DisposableObserver;

public class OutputObserver<T> extends DisposableObserver<T> {
    @Override
    public void onNext(T t) {
    }

    @Override
    public void onComplete() {
    }

    @Override
    public void onError(Throwable exception) {
    }
}
