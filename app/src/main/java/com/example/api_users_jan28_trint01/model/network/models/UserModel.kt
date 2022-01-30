package com.example.api_users_jan28_trint01.model.network.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class UserModel (
    val id : Int,
    val name : String,
    val username : String,
    val email : String,
    val address : AddressModel,
    val phone : String,
    val website : String,
    val company : CompanyModel
        )

