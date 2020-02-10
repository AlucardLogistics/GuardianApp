package com.alucardlogistics.guardianapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {
    @Expose
    @SerializedName("results")
    private List<Results> results;
    @Expose
    @SerializedName("orderBy")
    private String orderBy;
    @Expose
    @SerializedName("pages")
    private int pages;
    @Expose
    @SerializedName("currentPage")
    private int currentPage;
    @Expose
    @SerializedName("pageSize")
    private int pageSize;
    @Expose
    @SerializedName("startIndex")
    private int startIndex;
    @Expose
    @SerializedName("total")
    private int total;
    @Expose
    @SerializedName("userTier")
    private String userTier;
    @Expose
    @SerializedName("status")
    private String status;

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getUserTier() {
        return userTier;
    }

    public void setUserTier(String userTier) {
        this.userTier = userTier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
