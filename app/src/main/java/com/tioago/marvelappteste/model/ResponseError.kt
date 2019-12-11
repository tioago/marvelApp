package com.tioago.marvelappteste.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ResponseError: Serializable {
    @SerializedName("code")
    var code: String = ""

    @SerializedName("message")
    var message: String = ""


}