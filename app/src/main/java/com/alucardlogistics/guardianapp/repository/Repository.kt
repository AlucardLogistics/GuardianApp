package com.alucardlogistics.guardianapp.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.alucardlogistics.guardianapp.models.GuardianData
import com.alucardlogistics.guardianapp.retrofit.ApiService
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main

class Repository {

    var job: CompletableJob? = null

    fun getTheNews(query: String, pageNumber: String): LiveData<GuardianData> {

        job = Job()

        val apiService: ApiService = ApiService.getRetrofitInstance()
            .create(ApiService::class.java)

        return object: LiveData<GuardianData>() {
            override fun onActive() {
                super.onActive()

                job?.let { newsJob ->
                    CoroutineScope(IO + newsJob).launch {
                        val news = apiService.getNews(query, API_KEY, pageNumber)
                        withContext(Main) {
                            value = news
                            Log.d("RESPONSE", "Repo_data news current page: " + news.response?.currentPage)
                            Log.d("RESPONSE", "Repo_data: " + news.response!!.results[0].webTitle)
                            newsJob.complete()
                        }
                    }
                }
            }
        }
    }

    fun cancelJobs() {
        job?.cancel()
    }

    companion object {

        private const val API_KEY: String = "c24befa5-86af-4800-bae6-ec95f9daff16"
    }

}