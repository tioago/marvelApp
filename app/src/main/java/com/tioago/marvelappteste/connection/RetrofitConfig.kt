package com.tioago.marvelappteste.connection

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
* Your public key
2d1f5083dc95e7da8be9e947aa738c63
Your private key
ed51de2dcc4b3355da396974217383e33cd2659d
*
* ts - a timestamp (or other long string which can change on a request-by-request basis)
hash - a md5 digest of the ts parameter, your private key and your public key (e.g. md5(ts+privateKey+publicKey)
* */


class RetrofitConfig {
    private val retrofit = Retrofit.Builder()
            .baseUrl("https://gateway.marvel.com:443/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()



    fun apiService() = retrofit.create(APIService::class.java)


}