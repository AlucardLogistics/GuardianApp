package com.alucardlogistics.guardianapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class GuardianData(
    @Expose
    @SerializedName("response")
    var response: Response? = null
)