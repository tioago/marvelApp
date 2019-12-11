package com.tioago.marvelappteste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.tioago.marvelappteste.views.HomeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler().postDelayed(Runnable {
            //anything you want to start after 3s
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }, 3000)



    }
}
