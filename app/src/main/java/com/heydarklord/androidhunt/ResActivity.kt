package com.heydarklord.androidhunt

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import kotlinx.android.synthetic.main.activity_res.*

class ResActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res)

        val ttb1 = AnimationUtils.loadAnimation(this,R.anim.ttb)
        restxt.startAnimation(ttb1)
        hckrbtn.startAnimation(ttb1)
        blogbtn.startAnimation(ttb1)
        ytbtn.startAnimation(ttb1)
        slidebtn.startAnimation(ttb1)
        gitbtn.startAnimation(ttb1)


        val hkrbtn: Button = findViewById(R.id.hckrbtn)
        hkrbtn.setOnClickListener{
            val intweb = Intent(Intent.ACTION_VIEW)
            intweb.setData(Uri.parse("https://hackerone.com/hacktivity?querystring=android"))
            startActivity(intweb)
        }

        val blogbtn: Button = findViewById(R.id.blogbtn)
        blogbtn.setOnClickListener{
            val intweb = Intent(Intent.ACTION_VIEW)
            intweb.setData(Uri.parse("https://darktechsecret.blogspot.com/2020/05/android-blogs-for-learning.html"))
            startActivity(intweb)
        }

        val ytbtn: Button = findViewById(R.id.ytbtn)
        ytbtn.setOnClickListener{
            val intweb = Intent(Intent.ACTION_VIEW)
            intweb.setData(Uri.parse("https://darktechsecret.blogspot.com/2020/05/youtube-videos-for-learning.html"))
            startActivity(intweb)
        }
        val slidebtn: Button = findViewById(R.id.slidebtn)
        slidebtn.setOnClickListener{
            val intweb = Intent(Intent.ACTION_VIEW)
            intweb.setData(Uri.parse("https://darktechsecret.blogspot.com/2020/05/slides-for-android-bug-hunting.html"))
            startActivity(intweb)
        }

        val gitbtn: Button = findViewById(R.id.gitbtn)
        gitbtn.setOnClickListener{
            val intweb = Intent(Intent.ACTION_VIEW)
            intweb.setData(Uri.parse("https://darktechsecret.blogspot.com/2020/05/github-pages.html"))
            startActivity(intweb)
        }




    }
}
