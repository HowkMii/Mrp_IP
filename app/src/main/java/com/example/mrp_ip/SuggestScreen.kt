package com.example.mrp_ip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import com.example.mrp_ip.databinding.ActivitySuggestScreenBinding

class SuggestScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySuggestScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar: androidx.appcompat.app.ActionBar? =supportActionBar
        actionBar!!.hide()
        binding = ActivitySuggestScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val items = listOf("mostafa","DAIKI")
        val adapter = ArrayAdapter(this,R.layout.list_item,items)
        binding.dropdownField.setAdapter(adapter)
        val btns_skip: Button = findViewById(R.id.skipS)
        btns_skip.setOnClickListener{startActivity(Intent(this,TeamM::class.java))}


    }
}