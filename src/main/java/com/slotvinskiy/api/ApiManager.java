package com.slotvinskiy.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {

    public static final String SERVER_URL = "https://jsonplaceholder.typicode.com/";
    public static Retrofit retrofit;
    public static OkHttpClient httpClient;

    private static Retrofit getRetrofitInstance() {
        if (retrofit != null) {
            return retrofit;
        }
        if (httpClient == null) {
            httpClient = new OkHttpClient();
        }
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        retrofit = new Retrofit.Builder()
                .baseUrl(SERVER_URL)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    public static JsonplaceholderAPI getApiService() {
        return getRetrofitInstance().create(JsonplaceholderAPI.class);
    }

    public static void close() {
        httpClient.dispatcher().executorService().shutdown();
    }

}
