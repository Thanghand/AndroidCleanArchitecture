package com.thangcao.demo.common.base.usecase;

import com.thangcao.demo.common.base.output.OutputObserver;

/**
 * @author ThangCao
 */
public abstract class UseCase<Input, Output> {

    public void execute(Input param, OutputObserver<Output> baseOutput) {
        try {
            baseOutput.onNext(handleBusiness(param));
            baseOutput.onComplete();
        } catch (Exception ex) {
            baseOutput.onError(ex);
        }
    }
    protected abstract Output handleBusiness(Input param);

}
