package com.heydarklord.androidhunt

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatDelegate

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val apppref: SharedPreferences = getSharedPreferences("AppSetting", 0)
        val appedit:SharedPreferences.Editor = apppref.edit()
        val isnight:Boolean = apppref.getBoolean("night_mode",false)
        if (isnight){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }




        val toggle: ToggleButton = findViewById(R.id.toggleButton)
        toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                    // The toggle is enabled
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                    appedit.putBoolean("night_mode", true)
                    appedit.apply()
            } else {
                // The toggle is disabled
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                appedit.putBoolean("night_mode",false)
                appedit.apply()

            }
        }

        if (apppref.getBoolean("night_mode",true)) {
            toggle.isChecked = true
        } else {
            toggle.isChecked = false
        }



        val btn1: Button =  findViewById(R.id.aboutbtn)
        btn1.setOnClickListener{
            val intsocial= Intent(this,hkroneActivity::class.java)
            startActivity(intsocial)
        }

        }





}


