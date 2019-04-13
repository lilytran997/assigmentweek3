package com.example.assigment_week3

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_background_setting.*

class BackgroundSettingActivity : AppCompatActivity() {
    private var a:Int? = R.drawable.image9
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background_setting)
        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar!!.title = "Background"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //set onclick button
        image1.setOnClickListener(imagbutton1)
        image2.setOnClickListener(imagbutton2)
        image3.setOnClickListener(imagbutton3)
        image4.setOnClickListener(imagbutton4)
        image5.setOnClickListener(imagbutton5)
        image5.setOnClickListener(imagbutton6)
        btn_save.setOnClickListener(btnSave)

        // receive data
        val background_receive: Bundle? = intent.extras
        if (background_receive!=null)
        {
            val img = background_receive.getInt("mainbg")
            showimage.setImageResource(img)
        }
    }
    //button image
    private val imagbutton1 = View.OnClickListener {
        showimage.setImageResource(R.drawable.image1)
        a = R.drawable.image1
    }
    private val imagbutton2 = View.OnClickListener {
       showimage.setImageResource(R.drawable.image8)
        a = R.drawable.image8
    }
    private val imagbutton3 = View.OnClickListener {
        showimage.setImageResource(R.drawable.image3)
        a = R.drawable.image3
    }

    private val imagbutton4 = View.OnClickListener {
        showimage.setImageResource(R.drawable.image4)
        a = R.drawable.image4
    }

    private val imagbutton5 = View.OnClickListener {
        showimage.setImageResource(R.drawable.image7)
        a = R.drawable.image7
    }

    private val imagbutton6 = View.OnClickListener {
        showimage.setImageResource(R.drawable.image6)
        a = R.drawable.image6
    }
    //button save
    private val btnSave= View.OnClickListener {
        intent.putExtra("background", a)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

}
