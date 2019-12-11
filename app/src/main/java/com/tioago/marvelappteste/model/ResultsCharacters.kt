package com.tioago.marvelappteste.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*
import kotlin.collections.ArrayList

class ResultsCharacters: Serializable {
    @SerializedName("id")
    var id: Int = 0

    @SerializedName("name")
    var name: String = ""

    @SerializedName("description")
    var descript: String = ""

    @SerializedName("modified")
    var modified: String = ""

    @SerializedName("thumbnail")
    var thumbnail: Thumbnail? = null

    @SerializedName("resourceURI")
    var resourceURI: String = ""

    @SerializedName("typeResults")
    var typeResults: TypeResults? = null

    @SerializedName("series")
    var series: TypeResults? = null


    @SerializedName("stories")
    var stories: TypeResults? = null


    @SerializedName("events")
    var events: TypeResults? = null

    @SerializedName("urls")
    var urls: ArrayList<Items>? = null

}