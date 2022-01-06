package com.example.consume_api_with_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.consume_api_with_retrofit.interfaces.ApiCall;
import com.example.consume_api_with_retrofit.models.DataModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView  = findViewById(R.id.text);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/todos/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiCall apiCall = retrofit.create(ApiCall.class);

        Call<DataModel> call = apiCall.getData();

        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                if(response.code() != 200){
                    textView.setText("check the connection");
                    return;
                }

                String json =null;
                json = response.body().getId()+ response.body().getUserId()+response.body().getTitle() + response.body().isStatus();
            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {


            }
        });
    }
}