package com.example.assigment_week3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class TitleSettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_setting)
        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar!!.title = "Title"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }
}
