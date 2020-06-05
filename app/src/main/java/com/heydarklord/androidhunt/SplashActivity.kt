package com.heydarklord.androidhunt

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Window

import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity() {
 // Splash Screen


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash)
        val appref: SharedPreferences = getSharedPreferences("AppSetting", 0)
        if (appref.getBoolean("night_mode",true)){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
        //Animation Of Image
        val ttb1 = AnimationUtils.loadAnimation(this, R.anim.ttb)
        imageView2.startAnimation(ttb1)
         //From Here Real Handler Code Starts
        Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
            finish()

            },4000
        )
        //Making Float Msg and Log Msg
        Toast.makeText(this,"Welcome To AndroIDHunting", Toast.LENGTH_SHORT).show()
        Log.i( "Info","AndroIDHunting-V.1.0")


    }
}


