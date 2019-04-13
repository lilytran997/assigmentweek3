package com.example.assigment_week3

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_title_setting.*

class TitleSettingActivity : AppCompatActivity() {

    private var edtext: String? = "K15 Fetel"
    private var textcolor = "#D81B60"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_setting)
        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar!!.title = "Title"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Your text and view
        val colorview = findViewById<View>(R.id.colortext)
        colorview.setBackgroundColor(Color.parseColor(textcolor))

        textnew.setText(edtext)
        textnew.setTextColor(Color.parseColor(textcolor))
        //receive data
        val data:Bundle? = intent.extras
        if (data != null)
        {
            val editext: String? = data.getString("textmain")
            //val colortext: Int? = data.getInt("colortext")
            textnew.setText(editext)
        }

        //button
        val btncolor1 = findViewById<Button>(R.id.color1)
        btncolor1?.setOnClickListener {
            textcolor = "#D81B60"
            colorview.setBackgroundColor(Color.parseColor(textcolor))
            textnew.setTextColor(Color.parseColor( textcolor))
        }
        val btncolor2 = findViewById<Button>(R.id.color2)
        btncolor2?.setOnClickListener {
            textcolor = "#9C27B0"
            colorview.setBackgroundColor(Color.parseColor(textcolor))
            textnew.setTextColor(Color.parseColor( textcolor))
        }
        val btncolor3 = findViewById<Button>(R.id.color3)
        btncolor3?.setOnClickListener {
            textcolor = "#03A9F4"
            colorview.setBackgroundColor(Color.parseColor(textcolor))
            textnew.setTextColor(Color.parseColor( textcolor))
        }
        val btncolor4 = findViewById<Button>(R.id.color4)
        btncolor4?.setOnClickListener {
            textcolor = "#3F51B5"
            colorview.setBackgroundColor(Color.parseColor(textcolor))
            textnew.setTextColor(Color.parseColor( textcolor))
        }
        val btncolor5 = findViewById<Button>(R.id.color5)
        btncolor5?.setOnClickListener {
            textcolor = "#00C853"
            colorview.setBackgroundColor(Color.parseColor(textcolor))
            textnew.setTextColor(Color.parseColor( textcolor))
        }
        val btncolor6 = findViewById<Button>(R.id.color6)
        btncolor6?.setOnClickListener {
            textcolor = "#004D40"
            colorview.setBackgroundColor(Color.parseColor(textcolor))
            textnew.setTextColor(Color.parseColor( textcolor))
        }

        //save and send data
        val btn_save = findViewById<Button>(R.id.btn_save)
        btn_save?.setOnClickListener {
            edtext = textnew.text.toString()
            intent.putExtra("textshow", edtext)
            intent.putExtra("colortext",textcolor)
            setResult(Activity.RESULT_OK,intent)
            finish()
        }





    }
}
