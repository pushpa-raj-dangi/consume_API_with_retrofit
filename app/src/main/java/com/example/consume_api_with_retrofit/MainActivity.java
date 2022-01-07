package com.example.consume_api_with_retrofit;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.consume_api_with_retrofit.adapters.PostAdapter;
import com.example.consume_api_with_retrofit.interfaces.ApiCall;
import com.example.consume_api_with_retrofit.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        textView  = findViewById(R.id.text);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


//        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();


        Retrofit retrofit1 = new Retrofit.Builder().baseUrl("https://khabarhub.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

//        ApiCall apiCall = retrofit.create(ApiCall.class);
        ApiCall apiCall1 = retrofit1.create(ApiCall.class);

        Call<List<Post>> posts = apiCall1.getPosts();



//        Call<DataModel> call = apiCall.getData();
//        Call<List<DataModel>> call1 = apiCall.getDatass();

        posts.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {

                if(response.code() != 200){
//                    textView.setText("check the connection");
                    return;
                }

                List<Post> json =  response.body();

                List<Post> postList = response.body();
//                PostAdapter postAdapter = new PostAdapter(MainActivity.this , postList);
//                recyclerView.setAdapter(postAdapter);

                for (Post j:json
                ) {
                    Log.e("jjoihinh",String.valueOf(j.getId()));
                }

            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_SHORT);
            }
        });

//        call1.enqueue(new Callback<List<DataModel>>() {
//            @Override
//            public void onResponse(Call<List<DataModel>> call, Response<List<DataModel>> response) {
//                if(response.code() != 200){
////                    textView.setText("check the connection");
//                    return;
//                }
//
//                List<DataModel> json =  response.body();
//
//                for (DataModel j:json
//                     ) {
//                    Log.e("id",String.valueOf(j.getId()));
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<DataModel>> call, Throwable t) {
//
//            }
//        });



//        call.enqueue(new Callback<DataModel>() {
//            @Override
//            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
//                if(response.code() != 200){
//                    textView.setText("check the connection");
//                    return;
//                }
//
//                String json =  response.body().getId()+ response.body().getUserId()+response.body().getTitle() + response.body().isStatus();
//                textView.setText(json);
//            }
//
//            @Override
//            public void onFailure(Call<DataModel> call, Throwable t) {
//
//
//            }
//        });
    }
}