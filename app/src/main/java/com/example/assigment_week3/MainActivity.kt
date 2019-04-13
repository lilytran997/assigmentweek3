package com.example.assigment_week3

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
//import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var imge: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar!!.title = "Main Screen"
        //set onclick button
        bg_btn.setOnClickListener(buttonbg)
        title_btn.setOnClickListener(buttontitle)
    }

    //button change background
    private var mainimage: Int? = R.drawable.image9
    private val buttonbg = View.OnClickListener {
        val intent = Intent(this, BackgroundSettingActivity::class.java);
        intent.putExtra("mainbg",mainimage)
        startActivityForResult(intent,900);
    }

    //button change title
    private val buttontitle = View.OnClickListener {
        val intent = Intent(this, TitleSettingActivity::class.java);
        intent.putExtra("textmain",maintext.getText())
        startActivityForResult(intent,988);
    }

    //Result
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 988 && resultCode == Activity.RESULT_OK)
        {
            val text: String? = data?.getStringExtra("textshow")
            val colortext: String? = data?.getStringExtra("colortext")
            maintext.setText(text)
            maintext.setTextColor(Color.parseColor(colortext))
        }
        if (requestCode == 900 && resultCode == Activity.RESULT_OK){
            val background: Int? = data?.getIntExtra("background",0)
            if (background != null) {
                imageview.setImageResource(background)
                mainimage = background
            }
        }
    }


}

