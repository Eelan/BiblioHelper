package com.github.eelan.bibliohelper.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.eelan.bibliohelper.R
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setSupportActionBar(toolbar.apply { title = this@MainActivity.title })
        list_book.setOnClickListener {
            var intent = Intent(this@MainActivity, ListActivity::class.java)
            startActivity(intent)
        }
    }

}