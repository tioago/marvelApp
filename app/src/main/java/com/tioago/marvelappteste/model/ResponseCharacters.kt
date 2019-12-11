package com.tioago.marvelappteste.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ResponseCharacters: Serializable {
    @SerializedName("code")
    var code: Int = 0

    @SerializedName("status")
    var status: String = ""

    @SerializedName("copyright")
    var copyright: String = ""

    @SerializedName("attributionText")
    var attributionText: String = ""

    @SerializedName("attributionHTML")
    var attributionHTML: String = ""

    @SerializedName("etag")
    var etag: String = ""

    @SerializedName("data")
    var data: DataCharacter? = null




}

