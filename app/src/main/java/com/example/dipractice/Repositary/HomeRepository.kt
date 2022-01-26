package com.example.dipractice.Repositary

import com.example.dipractice.Network.SafeApiCall
import com.example.dipractice.Network.UserApi
import javax.inject.Inject

class HomeRepository @Inject constructor(private val api: UserApi) : SafeApiCall {

    suspend fun getMovieList(page : Int) = safeApiCall {
        api.getmovieList(page)
    }

    suspend fun getHoriMovieList(page : Int) = safeApiCall {
        api.gethorimovieList(page)
    }
}