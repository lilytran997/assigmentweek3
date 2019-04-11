package com.example.assigment_week3

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar!!.title = "Main Screen"

        val imge = findViewById<ImageView>(R.id.imageview)

        //change background
        val data = intent
        val img = data.getIntExtra("image",0)
        imge.setImageResource(img)

        //setonclick button
        val buttonbg = findViewById<Button>(R.id.bg_btn)
        buttonbg?.setOnClickListener {
            val intenta = Intent(this, BackgroundSettingActivity::class.java)
            intenta.putExtra("image1", img)
            startActivity(intenta)
        }
        val buttontitle = findViewById<Button>(R.id.title_btn)

        buttontitle?.setOnClickListener {
            val intentb = Intent(this, TitleSettingActivity::class.java)
            startActivity(intentb)
        }


    }




}

