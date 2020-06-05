package com.heydarklord.androidhunt

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import org.jetbrains.anko.find

class privateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_private)

        //Here You can Find Something Interesting


        val apppref: SharedPreferences = getSharedPreferences("AppSetting", 0)
        val appedit:SharedPreferences.Editor = apppref.edit()
        val sens:String = apppref.getString("SentiveInfo","MyCredentials").toString()

        val pirr: Button = findViewById(R.id.pir)
        pirr.setOnClickListener{
            appedit.putString("SentiveInfo","MyCredentials")
            appedit.apply()
        }
    }

}
