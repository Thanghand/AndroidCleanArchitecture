package com.thangcao.cooking.common.base.cloud;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class BaseRetrofitCloud {

    private final Retrofit retrofit;

    @Inject
    public BaseRetrofitCloud(Retrofit retrofit){
        this.retrofit = retrofit;
    }

    protected Retrofit getRetrofit(){
        return retrofit;
    }
}
