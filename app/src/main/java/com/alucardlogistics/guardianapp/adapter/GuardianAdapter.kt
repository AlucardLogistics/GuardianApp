package com.alucardlogistics.guardianapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alucardlogistics.guardianapp.R
import com.alucardlogistics.guardianapp.models.Results
import kotlinx.android.synthetic.main.news_item.view.*

class GuardianAdapter(private var newsList: List<Results>):
    RecyclerView.Adapter<GuardianAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false))

    }

    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

        holder.bind(newsList[position])

    }

    fun submitList(news: List<Results>) {
        newsList = news
    }


    class NewsViewHolder(view: View):
    RecyclerView.ViewHolder(view) {

        private var tvTitle: TextView = view.tv_title
        private var tvLink: TextView = view.tv_url

        fun bind(news: Results) {
            tvTitle.text = news.webTitle
            tvLink.text = news.webUrl
        }

    }
}


