package com.example.a150esaude

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backgroundColorSpan = object : Thread(){
            override fun run() {
                try {
                    Thread.sleep(2000)

                    val intent = Intent(baseContext, ApreActivity::class.java)
                    startActivity(intent)

                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        }
        backgroundColorSpan.start()
    }
}
