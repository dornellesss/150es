package com.example.a150esaude

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.content.ContentResolver
import android.content.Context
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.widget.TextView
import com.google.zxing.Result
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import me.dm7.barcodescanner.zxing.ZXingScannerView
import me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
import org.w3c.dom.Text

class QrcodeActivity : AppCompatActivity(),ResultHandler {

    private val REQUEST_CAMERA = 1
    private var scannerView :ZXingScannerView?=null
    private var txtResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrcode)

        scannerView = findViewById(R.id.scanner)

        txtResult = findViewById(R.id.txtResult)

        if (!checkPermission())
            requestPermissions()
    }

    private fun checkPermission() : Boolean {
        return ContextCompat.checkSelfPermission(this@QrcodeActivity,Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
    }

    private fun requestPermissions() {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA),REQUEST_CAMERA)
    }

    override fun onResume() {
        super.onResume()
        if (checkPermission()){
            if (scannerView == null){
                scannerView = findViewById(R.id.scanner)
                setContentView(scannerView)
            }
            scannerView?.setResultHandler(this)
            scannerView?.startCamera()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        scannerView?.stopCamera()
    }
    override fun handleResult(p0: Result?) {
        val result  = p0?.text
        val vibrator = applicationContext.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(1000)
        txtResult?.text = result
        scannerView?.setResultHandler(this)
        scannerView?.startCamera()


        /*
              val builder = AlertDialog.Builder(this)
              builder.setTitle("Result")
              builder.setPositiveButton("OK"){dialog,which ->
              scannerView?.resumeCameraPreview (this@QrcodeActivity )
              startActivity(intent)
              }

              builder.setMessage(result)
              val alert = builder.create()
              alert.show()
          */

    }
}
