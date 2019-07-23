package com.example.a150esaude

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log.*

class LogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        val context = this

        btnCadastrarMenu.setOnClickListener {
            val intent = Intent(context, LogoActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
