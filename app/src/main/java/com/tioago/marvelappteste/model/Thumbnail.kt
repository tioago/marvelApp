package com.tioago.marvelappteste.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Thumbnail: Serializable {
    @SerializedName("path")
    var path: String = ""

    @SerializedName("extension")
    var extensions: String = "jpg"

}