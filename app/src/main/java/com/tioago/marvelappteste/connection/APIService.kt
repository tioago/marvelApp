package com.tioago.marvelappteste.connection

import com.tioago.marvelappteste.model.ResponseCharacters
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface APIService {
    @GET("/v1/public/characters")
    fun listCharacters(@Query("ts") ts:Int,
                       @Query("apiKey") apiKey: String,
                       @Query("hash") hash: String,
                       @Query("name") name: String,
                       @Query("nameStartsWith") nameStartsWith: String,
                       @Query("modifiedSince") modifiedSince: Date,
                       @Query("comics") comics: Int,
                       @Query("series") series: Int,
                       @Query("events") events: Int,
                       @Query("stories") stories: Int,
                       @Query("orderBy") orderBy: String,
                       @Query("limit") limit: Int,
                       @Query("offset") offset: Int) : Call<ResponseCharacters>

}