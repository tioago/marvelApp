package com.tioago.marvelappteste.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DataCharacter: Serializable {
    @SerializedName("offset")
    var offset: Int = 0

    @SerializedName("limit")
    var limit: Int = 0

    @SerializedName("total")
    var total: Int = 0

    @SerializedName("count")
    var count: Int = 0

    @SerializedName("results")
    var results: ArrayList<ResultsCharacters>? = null

}