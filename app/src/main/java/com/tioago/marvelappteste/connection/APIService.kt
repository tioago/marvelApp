package com.tioago.marvelappteste.connection

import com.tioago.marvelappteste.model.ResponseCharacters
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    /*
* Your public key
2d1f5083dc95e7da8be9e947aa738c63
Your private key
ed51de2dcc4b3355da396974217383e33cd2659d
*
* ts - a timestamp (or other long string which can change on a request-by-request basis)
hash - a md5 digest of the ts parameter, your private key and your public key (e.g. md5(ts+privateKey+publicKey)
* */

    @GET("/v1/public/characters")
    fun listCharacters(@Query("ts") ts:Int,
                       @Query("apikey") apiKey: String,
                       @Query("hash") hash: String,
                       @Query("name") name: String,
                       //@Query("nameStartsWith") nameStartsWith: String
                       //@Query("modifiedSince") modifiedSince: Date,
                       //@Query("comics") comics: Int,
                       //@Query("series") series: Int,
                       //@Query("events") events: Int,
                       //@Query("stories") stories: Int,
                       @Query("orderBy") orderBy: String
                       //@Query("limit") limit: Int
                       //@Query("offset") offset: Int
    ): Call<ResponseCharacters>

}