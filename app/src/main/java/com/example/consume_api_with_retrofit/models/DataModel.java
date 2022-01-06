package com.example.consume_api_with_retrofit.models;

import com.google.gson.annotations.SerializedName;

public class DataModel {
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private int userId;
    private  int id;
    private String title;

    @SerializedName("completed")
    private boolean status;
}
