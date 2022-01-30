package com.example.api_users_jan28_trint01.model.network.models

import com.squareup.moshi.JsonClass

//not sure if i need to the @JsonClass(generateAdapter = true) here
//because this is just a helper data class and UserModle should be the main data class

@JsonClass(generateAdapter = true)
data class GeoModel (
     val lat : Double,
     val lng : Double
 )
