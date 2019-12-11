package com.tioago.marvelappteste.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Items: Serializable {
    @SerializedName("resourceURI")
    var resourceURI: String = ""

    @SerializedName("name")
    var name: String = ""

    @SerializedName("type")
    var type: String = ""

    @SerializedName("url")
    var url: String = ""
}