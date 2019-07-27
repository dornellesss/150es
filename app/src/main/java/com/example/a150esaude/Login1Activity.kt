package com.example.a150esaude

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log.*
import kotlinx.android.synthetic.main.activity_login1.*

class Login1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        val context = this

        btnCadastrarLogin.setOnClickListener {
            val intent = Intent(context, PrincipalMenuActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
