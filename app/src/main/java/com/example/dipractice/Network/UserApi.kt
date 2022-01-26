package com.example.dipractice.Network

import com.example.dipractice.Model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApi {

    @GET("movie/popular")
    suspend fun getmovieList(@Query("page") page: Int): MovieResponse

    @GET("movie/popular")
    suspend fun gethorimovieList(@Query("page") page: Int): MovieResponse
}