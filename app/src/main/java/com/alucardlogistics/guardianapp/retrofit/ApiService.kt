package com.alucardlogistics.guardianapp.retrofit

import com.alucardlogistics.guardianapp.models.GuardianData
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

//    url
//    https://content.guardianapis.com/search?q=trump&api-key=API-KEY&page=1

    @GET("search")
    suspend fun getNews(
        @Query("q") query: String,
        @Query("api-key") apiKey: String,
        @Query("page") pageNumber: String
    ): GuardianData

    companion object {

        private val BASE_URL = "https://content.guardianapis.com"

        fun getRetrofitInstance(): Retrofit {

            return Retrofit.Builder()
                 .baseUrl(BASE_URL)
                 .addConverterFactory(GsonConverterFactory.create())
                 .build()
        }
    }

}