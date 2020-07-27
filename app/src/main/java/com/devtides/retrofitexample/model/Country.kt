package com.devtides.retrofitexample.model

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("name")
    val countryName: String?,

    @SerializedName("flagPNG")
    val flag: String?
)