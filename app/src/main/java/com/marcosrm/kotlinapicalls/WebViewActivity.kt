package com.marcosrm.kotlinapicalls

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        supportActionBar!!.title = "Swagger Api"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
