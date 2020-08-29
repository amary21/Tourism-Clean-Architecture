package com.dicoding.tourismapp.core.data.source.remote.network

import com.dicoding.tourismapp.core.data.source.remote.response.ListTourismResponse
import retrofit2.http.GET

interface ApiSevice {
    @GET("list")
    suspend fun getList(): ListTourismResponse
}