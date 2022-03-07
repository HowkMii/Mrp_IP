package com.example.mrp_ip

import android.app.ActionBar
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar: androidx.appcompat.app.ActionBar? =supportActionBar
        actionBar!!.hide()
        val btn_skip: Button = findViewById(R.id.skipM)
        btn_skip.setOnClickListener{startActivity(Intent(this,SuggestScreen::class.java))}

}
}