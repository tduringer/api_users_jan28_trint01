package com.example.api_users_jan28_trint01.model.network.models

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class CompanyModel(
    val name : String,
    val catchPhrase : String,
    val bs : String
)
