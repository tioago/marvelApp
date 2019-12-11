package com.tioago.marvelappteste.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.gson.GsonBuilder
import com.tioago.marvelappteste.R
import com.tioago.marvelappteste.adapter.ItemsAdapter
import com.tioago.marvelappteste.connection.RetrofitConfig
import com.tioago.marvelappteste.model.Items
import com.tioago.marvelappteste.model.ResponseCharacters
import com.tioago.marvelappteste.model.ResultsCharacters
import com.tioago.marvelappteste.model.TypeResults
import kotlinx.android.synthetic.main.activity_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeActivity : AppCompatActivity() {

    val gson = GsonBuilder().setPrettyPrinting().create()

    val ts: Int = 1
    val apiKey: String = "2d1f5083dc95e7da8be9e947aa738c63" //privatekey
    val privateKey: String = "ed51de2dcc4b3355da396974217383e33cd2659d" //publickey
    var hash: String = "ed2524943f1559e675299b117a0311ac"
    val orderBy: String = "name" //name, modified, -name, -modified
    var listResults: ArrayList<Items>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        btnSearch.setOnClickListener {
            callSearch()
        }
    }

    fun callSearch() {
        Log.e("TESTE", " >> " + edtSearch.text)
        val call = RetrofitConfig().apiService().listCharacters(1,
            apiKey,
            hash,
            edtSearch.text.toString(),
            orderBy)

        call.enqueue(object: Callback<ResponseCharacters> {
            override fun onResponse(
                call: Call<ResponseCharacters>, response: Response<ResponseCharacters>) {

                response?.body()?.let {

                    val responseObj: ResponseCharacters? = it

                    Log.e("TESTE > ", gson.toJson(responseObj?.data?.results?.get(0)?.series?.items))

                    listResults = responseObj?.data?.results?.get(0)?.series?.items
                    configureList(listResults)


                }



            }

            override fun onFailure(call: Call<ResponseCharacters>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Toast.makeText(applicationContext, t?.message,Toast.LENGTH_LONG).show();
            }
        })
    }

    private fun configureList(listResults: ArrayList<Items>?) {
        Log.e("TAMANHO LIST > ", " >>>> " + listResults?.size)
        val recyclerView = listItens
        recyclerView.adapter = ItemsAdapter(listResults, this)
        val layoutManager = StaggeredGridLayoutManager(
            2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }
}
