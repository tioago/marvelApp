package com.tioago.marvelappteste.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class TypeResults: Serializable {

    @SerializedName("available")
    var available: Int = 0

    @SerializedName("collectionURI")
    var collectionURI: String = ""

    @SerializedName("items")
    var items: ArrayList<Items>? = null

    @SerializedName("returned")
    var returned: Int = 0

}