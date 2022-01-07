package com.example.consume_api_with_retrofit.interfaces;

import com.example.consume_api_with_retrofit.models.DataModel;
import com.example.consume_api_with_retrofit.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiCall {

    @GET("todos")
    Call<List<DataModel>> getDatass();

    @GET("1")
    Call<DataModel> getData();

    @GET("index.php?rest_route=/wp/v2/posts&per_page=10")
    Call<List<Post>> getPosts();

}
