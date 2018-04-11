package com.thangcao.cooking.common.retrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public final class RetrofitConfig {

    public static final String BASE_URL = "http://localhost:3000/v1.0.0/fakeapi/";
    private static final int TIME_TWO_MINUTE = 2;

    public static OkHttpClient getClient() {
        OkHttpClient client;
        Interceptor interceptor = chain -> {
            Request.Builder request = chain.request().newBuilder();
            return chain.proceed(request.build());
        };

        client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .connectTimeout(TIME_TWO_MINUTE, TimeUnit.MINUTES)
                .readTimeout(TIME_TWO_MINUTE, TimeUnit.MINUTES)
                .build();

        return client;
    }
}
