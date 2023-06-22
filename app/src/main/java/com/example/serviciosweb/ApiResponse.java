package com.example.serviciosweb;

import com.google.gson.annotations.SerializedName;

public class ApiResponse {
    @SerializedName("result")
    private int result;

    public int getResult() {
        return result;
    }
}
