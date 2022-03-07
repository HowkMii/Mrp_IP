package com.example.mrp_ip

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.mrp_ip.databinding.ActivityTeamMBinding

import com.google.android.material.textfield.TextInputEditText

class TeamM : AppCompatActivity() {
    private lateinit var binding:ActivityTeamMBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_m)
        val actionBar: androidx.appcompat.app.ActionBar? =supportActionBar
        actionBar!!.hide()
        binding = ActivityTeamMBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.joinIT.visibility= View.GONE
        binding.JoinT.setOnClickListener {
            binding.joinIT.visibility= View.VISIBLE
            binding.CreateT.text="Join"
            binding.JoinT.isEnabled=false
            binding.JoinT.isClickable=false


        }
        binding.CreateT.setOnClickListener{
            if(binding.CreateT.text=="Create Team")startActivity(Intent(this,CreateTeam::class.java))
            else if (binding.CreateT.text=="Join"){
                    startActivity(Intent(this,CreateTeam::class.java))
                    Toast.makeText(applicationContext,"Rak m3a team flani",Toast.LENGTH_SHORT).show()

            }


        }



    }
}