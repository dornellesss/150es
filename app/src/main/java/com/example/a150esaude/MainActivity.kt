package com.example.a150esaude

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeToLogin()
    }

    fun changeToLogin() {
        val intent = Intent(this, ApreActivity::class.java)

        Handler().postDelayed({
            intent.change()
        }, 2000)
    }
    fun Intent.change(){
        startActivity(this)
        finish()
    }
}
