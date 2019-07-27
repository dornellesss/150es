package com.example.a150esaude

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Build
import android.widget.Toast
import android.view.Window
import android.view.WindowManager
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_log.*

class LogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        //   if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) (
        //         window.statusBarColor(R.color.colorPrimary)
        //       )
//    }

        // @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        // fun Window.setStatusBarColorTo(color: Int){
        //  this Window.setStatusBarColorTo(R.color.colorPrimary)
        //    this.ClearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

        //  this.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        // this.statusBarColor = contextCompact.getColor(baseContext, color)

               val context = this

             btnCadastrarMenu.setOnClickListener {
               val intent = Intent(context, LogoActivity::class.java)
             Toast.makeText(applicationContext, " Favor preenccher todo so campos!", Toast.LENGTH_LONG).show()
           startActivity(intent)
         finish()
          }
    }
}
