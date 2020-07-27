package com.devtides.retrofitexample.model

import retrofit2.Call
import retrofit2.http.GET

interface CountriesApi {
    @GET("DevTides/countries/master/countriesV2.json")
    fun getCountries(): Call<List<Country>>
}