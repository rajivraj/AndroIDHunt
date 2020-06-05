package com.heydarklord.androidhunt


import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val appref: SharedPreferences = getSharedPreferences("AppSetting", 0)
        if (appref.getBoolean("night_mode",true)){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

        //Animation
        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb)
        imglogo.startAnimation(ttb)
        button2.startAnimation(ttb)
        button3.startAnimation(ttb)
        button4.startAnimation(ttb)
        button5.startAnimation(ttb)
        //Opening Activity By Buttons
        val basicbtn: Button = findViewById(R.id.button2)
        basicbtn.setOnClickListener {
            val intentbasic = Intent(this, BasicActivity::class.java)
            //Starting Basic Intent
            startActivity(intentbasic)
        }

        val resbtn:  Button =  findViewById(R.id.button3)
        resbtn.setOnClickListener {
         val intentres = Intent(this,ResActivity::class.java)
            startActivity(intentres)

        }

        val tgbtn: Button = findViewById(R.id.button4)
        tgbtn.setOnClickListener{
            val intenttg = Intent(this,TrainGActivity::class.java)
            startActivity(intenttg)
        }
        val settingbtn: Button = findViewById(R.id.button5)
        settingbtn.setOnClickListener{
            val intentset = Intent(this,SettingActivity::class.java)
            startActivity(intentset)
        }

    }

    fun loadinsta(view: View) {
        val intweb = Intent(Intent.ACTION_VIEW)
        intweb.setData(Uri.parse("https://instagram.com/heydarklord"))
        startActivity(intweb)
    }

    fun loadlink(view: View) {
        val intweb = Intent(Intent.ACTION_VIEW)
        intweb.setData(Uri.parse("https://my.linkedin.com/in/heydarklord"))
        startActivity(intweb)
    }
    fun loadfb(view: View) {
        val intweb = Intent(Intent.ACTION_VIEW)
        intweb.setData(Uri.parse("https://facebook.com/heydarklordpage"))
        startActivity(intweb)
    }
}
