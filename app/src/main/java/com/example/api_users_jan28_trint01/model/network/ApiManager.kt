package com.example.api_users_jan28_trint01.model.network

class ApiManager {

    private var userService: UserService =
        RetrofitInstance.providesRetrofit().create(UserService::class.java)

    suspend fun getUsers() = userService.getUsers()
}