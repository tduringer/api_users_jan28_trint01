package com.example.api_users_jan28_trint01.model.repository

import android.util.Log
import com.example.api_users_jan28_trint01.model.network.ApiManager
import com.example.api_users_jan28_trint01.model.network.models.UserModel
import com.example.api_users_jan28_trint01.view.TAG
import java.lang.Exception



class UserRepository(
    private val apiManager: ApiManager
) {
    suspend fun getUsers() : List<UserModel>? {
        return try {
            val response = apiManager.getUsers()
            if (response.isSuccessful) {
                Log.d(TAG,"Inside UserRepository: getUsers(): try statement: if(response.isSuccessful): pass ${response.isSuccessful}")
                Log.d(TAG,"Inside UserRepository: getUsers(): try statement: if(response.isSuccessful): response is $response")
                Log.d(TAG,"Inside UserRepository: getUsers(): try statement: if(response.isSuccessful): response body is ${response.body()}")
                //Log.d(TAG,"Inside UserRepository: getUsers(): try statement: if(response.isSuccessful): response  ${response.body().}")
                response.body()
            } else {
                Log.d(TAG,"Inside UserRepository: getUsers(): try statement: if(response.isSuccessful): fail ${response.isSuccessful}")
                emptyList()
            }
        } catch (ex : Exception) {
            Log.d(TAG, "Inside UserRepository: getUsers(): catch : exception is $ex")
            emptyList()
        }
    }
}