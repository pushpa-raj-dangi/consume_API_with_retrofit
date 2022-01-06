
package com.example.consume_api_with_retrofit.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Meta {

    @SerializedName("spay_email")
    @Expose
    private String spayEmail;

    public String getSpayEmail() {
        return spayEmail;
    }

    public void setSpayEmail(String spayEmail) {
        this.spayEmail = spayEmail;
    }

}
