package com.example.mrp_ip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.appcompat.app.ActionBar
import com.example.mrp_ip.databinding.ActivityCreateTeamBinding
import com.example.mrp_ip.databinding.ActivitySuggestScreenBinding

class CreateTeam : AppCompatActivity() {
    private lateinit var binding: ActivityCreateTeamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar: ActionBar? =supportActionBar
        actionBar!!.hide()
        binding = ActivityCreateTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val items = listOf("Theme1","Theme2")
        val adapter = ArrayAdapter(this,R.layout.list_item,items)
        binding.dropdownField1.setAdapter(adapter)
        binding.dropdownField2.setAdapter(adapter)
        binding.dropdownField3.setAdapter(adapter)
        val btns_submit: Button = findViewById(R.id.SubmitCT)
        btns_submit.setOnClickListener{startActivity(Intent(this,WaitingScreen::class.java))}

    }
}