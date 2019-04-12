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

    lateinit var imge: ImageView
    //var imga: Int? = R.id.imageview
    lateinit var mtext: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar!!.title = "Main Screen"
        imge = findViewById(R.id.imageview)
        imge.setImageResource(R.drawable.image9)
        mtext = findViewById(R.id.maintext)
        //change background

        // save image
      //  imga = savedInstanceState?.getInt("saveimage",img)

        //setonclick button

    }

    override fun onStart() {
        super.onStart()
        val data = intent
        val img = data.getIntExtra("image",0)
        imge.setImageResource(img)
        //imga = img
        val buttonbg = findViewById<Button>(R.id.bg_btn)
        buttonbg?.setOnClickListener {
            val intenta = Intent(this, BackgroundSettingActivity::class.java)
            intenta.putExtra("image1", img)
            startActivity(intenta)
        }
        val buttontitle = findViewById<Button>(R.id.title_btn)

        buttontitle?.setOnClickListener {
            val intentb = Intent(this, TitleSettingActivity::class.java)
            intentb.putExtra("text",maintext.text)
            intentb.putExtra("color",maintext.currentTextColor)
            startActivity(intentb)
        }
    }


    //

    //override fun onSaveInstanceState(outState: Bundle?) {
        //outState?.run {
        //    putInt("saveimage", imga)
      //  }

      //  super.onSaveInstanceState(outState)

  //  }

  //  override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
      //  super.onRestoreInstanceState(savedInstanceState)
   // }


}

