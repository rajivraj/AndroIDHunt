package com.heydarklord.androidhunt

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val webvieww: WebView = findViewById(R.id.webview)
        webvieww.loadUrl("https://darktechsecret.blogspot.com/2020/02/cyber-law-in-india-better-to-understand.html")
        webvieww.settings.javaScriptEnabled = true






    }
}


