package com.example.assigment_week3

import android.app.Activity
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

        //imageview
        val imageView = findViewById<ImageView>(R.id.showimage)
        val data = intent
        val img = data.getIntExtra("image1",0)
        imageView.setImageResource(img)

        //imageButton
        var a: Int = img
        val imageButton = findViewById<ImageButton>(R.id.image1)
        imageButton?.setOnClickListener {
            imageView.setImageResource(R.drawable.image1)
            a = R.drawable.image1
        }
        val imageButton2 = findViewById<ImageButton>(R.id.image2)
        imageButton2?.setOnClickListener {
            imageView.setImageResource(R.drawable.image8)
             a = R.drawable.image8
        }
        val imageButton3 = findViewById<ImageButton>(R.id.image3)
        imageButton3?.setOnClickListener {
            imageView.setImageResource(R.drawable.image3)
            a = R.drawable.image3
        }
        val imageButton4 = findViewById<ImageButton>(R.id.image4)
        imageButton4?.setOnClickListener {
            imageView.setImageResource(R.drawable.image4)
            a = R.drawable.image4
        }
        val imageButton5 = findViewById<ImageButton>(R.id.image5)
        imageButton5?.setOnClickListener {
            imageView.setImageResource(R.drawable.image7)
            a = R.drawable.image7
        }
        val imageButton6 = findViewById<ImageButton>(R.id.image6)
        imageButton6?.setOnClickListener {
            imageView.setImageResource(R.drawable.image6)
            a = R.drawable.image6
        }


        //intent
        val intent = Intent(this, MainActivity::class.java)
        //button save
        val button = findViewById<Button>(R.id.btn_save)
        button?.setOnClickListener {
            intent.putExtra("image", a)
            startActivity(intent)
        }
    }

}
