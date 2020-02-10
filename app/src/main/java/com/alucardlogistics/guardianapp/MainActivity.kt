package com.alucardlogistics.guardianapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.alucardlogistics.guardianapp.models.Results
import com.alucardlogistics.guardianapp.adapter.GuardianAdapter
import com.alucardlogistics.guardianapp.models.GuardianData

import com.alucardlogistics.guardianapp.viewmodels.GuardianViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var startingPage = "1"
    private lateinit var newsLiveList: LiveData<GuardianData>
    private var newsList: List<Results> = listOf()
    private lateinit var guardianAdapter: GuardianAdapter
    private lateinit var guardianViewModel: GuardianViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nextSearch = 1

        guardianViewModel = ViewModelProvider(this).get(GuardianViewModel::class.java)

        initRecyclerView()

        bt_search.setOnClickListener {
            val query = et_query.text.toString()
            nextSearch = 1
            Log.d("MAIN RESPONSE", "query: $query")
            //getNews(query, startingPage)
            getLiveNews(query, startingPage)
        }

        bt_next_search.setOnClickListener {
            val query = et_query.text.toString()
            nextSearch += 1
            getLiveNews(query, nextSearch.toString())
        }

    }

    private fun initRecyclerView() {

        rv_news.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            guardianAdapter = GuardianAdapter(newsList)
            adapter = guardianAdapter
        }

    }

    private fun loadData() {
        guardianAdapter.notifyDataSetChanged()
        guardianAdapter.submitList(newsList)
    }

    private fun getLiveNews(query: String, pageNumber: String) {

        newsLiveList = guardianViewModel.getTheLiveNews(query, pageNumber)

        newsLiveList.observe(this, Observer { guardianList ->
            newsList = guardianList.response!!.results
            Log.d("MAIN RESPONSE", "news live data title : ${newsList[0].webTitle}")
            loadData()
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        guardianViewModel.cancelJobs()
    }
}
