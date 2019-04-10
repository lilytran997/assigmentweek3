package com.example.assigment_week3

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_background_setting.*

class BackgroundSettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background_setting)
        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar!!.title = "Background"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //intent
        val intent = Intent (this, MainActivity::class.java)
       //imageview
        val imageView = findViewById<ImageView>(R.id.showimage)
        //hashmap
        val hashMap:HashMap<String , Int> = HashMap<String , Int>()
        //imageButton
        val imageButton = findViewById<ImageButton>(R.id.image1)
        imageButton?.setOnClickListener {
            imageView.setImageResource(R.drawable.image1)
            hashMap.put("image1",R.drawable.image1)
        }
        val imageButton2 = findViewById<ImageButton>(R.id.image2)
        imageButton2?.setOnClickListener {
            imageView.setImageResource(R.drawable.image2)
            hashMap.put("image2",R.drawable.image2)
        }
        val imageButton3 = findViewById<ImageButton>(R.id.image3)
        imageButton3?.setOnClickListener {
            imageView.setImageResource(R.drawable.image3)
            hashMap.put("image3",R.drawable.image3)
        }
        val imageButton4 = findViewById<ImageButton>(R.id.image4)
        imageButton4?.setOnClickListener {
            imageView.setImageResource(R.drawable.image4)
            hashMap.put("image4",R.drawable.image4)
        }
        val imageButton5 = findViewById<ImageButton>(R.id.image5)
        imageButton5?.setOnClickListener {
            imageView.setImageResource(R.drawable.image5)
            hashMap.put("image5",R.drawable.image5)
        }
        val imageButton6 = findViewById<ImageButton>(R.id.image6)
        imageButton6?.setOnClickListener {
            imageView.setImageResource(R.drawable.image6)
            hashMap.put("image6",R.drawable.image6)
        }
        //button save
        val button = findViewById<Button>(R.id.btn_save)
        button?.setOnClickListener{

        }
    }
}
