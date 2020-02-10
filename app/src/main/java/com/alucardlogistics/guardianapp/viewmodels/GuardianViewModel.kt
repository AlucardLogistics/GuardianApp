package com.alucardlogistics.guardianapp.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.alucardlogistics.guardianapp.models.GuardianData
import com.alucardlogistics.guardianapp.repository.Repository

class GuardianViewModel: ViewModel() {

    lateinit var newsLiveList: LiveData<GuardianData>

    fun getTheLiveNews(query: String, pageNumber: String): LiveData<GuardianData> {
        newsLiveList = Repository().getTheNews(query, pageNumber)
        return  newsLiveList
    }

    fun cancelJobs() {
        Repository().cancelJobs()
    }
}