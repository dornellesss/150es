package com.example.a150esaude

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_apre.*

class ApreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apre)

        val context = this

        btnCadastar.setOnClickListener {
            val intent = Intent(context, LogActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnLogin.setOnClickListener {
            val intent = Intent(context, Login1Activity::class.java)
            startActivity(intent)
            finish()
        }

       // imbtnQrcode.setOnClickListener{
         //   val intent = Intent(context, QrcodeActivity::class.java)
          //  startActivity(intent)
         //   finish()
      //  }
    }
}
