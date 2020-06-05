package com.heydarklord.androidhunt

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hkrone.*


class hkroneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hkrone)


        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb)
        logo.startAnimation(ttb)
        whoiam.startAnimation(ttb)
        wh1.startAnimation(ttb)
        wh2.startAnimation(ttb)



    }

}
