package com.commit451.hyperion.chuck.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.readystatesoftware.chuck.ChuckInterceptor
import com.willowtreeapps.hyperion.core.Hyperion
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val client = OkHttpClient.Builder()
                .addInterceptor(ChuckInterceptor(applicationContext).showNotification(false))
                .build()

        buttonCreateTraffic.setOnClickListener {
            val request = Request.Builder()
                    .url("https://jsonplaceholder.typicode.com/posts/1")
                    .build()
            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call?, e: IOException?) {

                }

                override fun onResponse(call: Call?, response: Response?) {

                }
            })
        }

        buttonOpenHyperion.setOnClickListener {
            Hyperion.open()
        }
    }
}
