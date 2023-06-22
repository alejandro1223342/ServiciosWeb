package com.example.serviciosweb;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("Potencia")
    Call<ApiResponse> getPotencia(@Query("base") double base, @Query("exponente") double exponente);

    @GET("TrinomioCuadradoPerfecto")
    Call<ApiResponse> getTrinomioCuadradoPerfecto(@Query("a") double a, @Query("b") double b, @Query("c") double c);

    @GET("FormulaGeneral")
    Call<ApiResponse> getFormulaGeneral(@Query("a") double a, @Query("b") double b, @Query("c") double c);
}
