package com.example.consume_api_with_retrofit.interfaces;

import com.example.consume_api_with_retrofit.models.DataModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiCall {

    @GET("1")
    Call<DataModel> getData();
}
