package com.example.assigment_week3

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar!!.title = "Main Screen"

        //show image
        val imge = findViewById<ImageView>(R.id.imageview)
        val data = intent
        val img = data.getIntExtra("image",0)
            imge.setImageResource(img)
        //setonclick button
        bg_btn.setOnClickListener(backgroundlistener)
        title_btn.setOnClickListener(titlelistenre)
    }
    //define backgroundlistener
    private val backgroundlistener = View.OnClickListener {
        val intenta = Intent(this, BackgroundSettingActivity::class.java)
        startActivity(intenta)
    }
    //define titlelistener
    private val titlelistenre = View.OnClickListener {
        val intentb = Intent(this, TitleSettingActivity::class.java)
        startActivity(intentb)
    }




}

