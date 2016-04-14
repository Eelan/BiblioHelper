package com.github.eelan.bibliohelper.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.eelan.bibliohelper.R
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.main_activity.*
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity () {
    var scan_content="";
    var scan_format="";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setSupportActionBar(toolbar.apply { title = this@MainActivity.title })
        list_book.setOnClickListener {
            var intent = Intent(this@MainActivity, ListActivity::class.java)
            startActivity(intent)
        }

        isbn_scanner.setOnClickListener {
            val scanIntegrator = IntentIntegrator(this)
            scanIntegrator.initiateScan()
        }
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        val scanResult = IntentIntegrator.parseActivityResult(requestCode,resultCode,data) ?: null
        if (scanResult!=null){
            scan_content = scanResult.contents //récup de de l'isbn
            scan_format = scanResult.formatName
        }else{
            toast("no scan data receive")
        }
    }
}