
package com.example.consume_api_with_retrofit.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class VersionHistory {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("href")
    @Expose
    private String href;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}
