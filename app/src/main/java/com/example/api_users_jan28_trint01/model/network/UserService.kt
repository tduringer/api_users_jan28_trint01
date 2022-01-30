package com.example.api_users_jan28_trint01.model.network

import com.example.api_users_jan28_trint01.model.network.models.UserModel
import retrofit2.Response
import retrofit2.http.GET

interface UserService {

    @GET("users")
    suspend fun getUsers(): Response<List<UserModel>>
}