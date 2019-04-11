package com.example.assigment_week3

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText

class TitleSettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_setting)
        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar!!.title = "Title"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Your text
        val edtext = findViewById<EditText>(R.id.text)
        edtext.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {


            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

        })

        //view
        val colorview = findViewById<View>(R.id.colortext)

        //button
        val btncolor1 = findViewById<Button>(R.id.color1)
        btncolor1?.setOnClickListener {
            colorview.setBackgroundColor(Color.parseColor("#D81B60"))
            edtext.setTextColor(Color.parseColor("#D81B60"))
        }
        val btncolor2 = findViewById<Button>(R.id.color2)
        btncolor2?.setOnClickListener {
            colorview.setBackgroundColor(Color.parseColor("#9C27B0"))
            edtext.setTextColor(Color.parseColor("#9C27B0"))
        }
        val btncolor3 = findViewById<Button>(R.id.color3)
        btncolor3?.setOnClickListener {
            colorview.setBackgroundColor(Color.parseColor("#03A9F4"))
            edtext.setTextColor(Color.parseColor("#03A9F4"))
        }
        val btncolor4 = findViewById<Button>(R.id.color4)
        btncolor4?.setOnClickListener {
            colorview.setBackgroundColor(Color.parseColor("#3F51B5"))
            edtext.setTextColor(Color.parseColor("#3F51B5"))
        }
        val btncolor5 = findViewById<Button>(R.id.color5)
        btncolor5?.setOnClickListener {
            colorview.setBackgroundColor(Color.parseColor("#00C853"))
            edtext.setTextColor(Color.parseColor("#00C853"))
        }
        val btncolor6 = findViewById<Button>(R.id.color6)
        btncolor6?.setOnClickListener {
            colorview.setBackgroundColor(Color.parseColor("#004D40"))
            edtext.setTextColor(Color.parseColor("#004D40"))
        }

        //intent and button save
        val intenttitle = Intent(this, MainActivity::class.java)
        val btn_save = findViewById<Button>(R.id.btn_save)
        btn_save?.setOnClickListener {
            startActivity(intenttitle)
        }





    }
}
