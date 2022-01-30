package com.example.api_users_jan28_trint01.model.network.models

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class AddressModel (
    val street : String,
    val suite : String,
    val city : String,
    val zipcode : String,
    val geo : GeoModel
        )
