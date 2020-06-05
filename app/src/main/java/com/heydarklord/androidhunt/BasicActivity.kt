package com.heydarklord.androidhunt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import kotlinx.android.synthetic.main.activity_basic.*
import org.jetbrains.anko.find
import java.nio.channels.InterruptedByTimeoutException


class BasicActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)
//Animating Whole Thing Because I Love
        val ttb1 = AnimationUtils.loadAnimation(this,R.anim.ttb)
        imgviewer.startAnimation(ttb1)
        basicinfobtn.startAnimation(ttb1)
        commenissuebtn.startAnimation(ttb1)
        toolbtn.startAnimation(ttb1)
        bugbtn.startAnimation(ttb1)
// Ending Animation And Adding Btn Works
        //Basic Button Where I will Store Every Info About Android
        val basicinfobtn: Button = findViewById(R.id.basicinfobtn)
        basicinfobtn.setOnClickListener{
            val intbasic = Intent(this, basicandroActivity::class.java)
            startActivity(intbasic)
        }
        val bugbtn: Button = findViewById(R.id.bugbtn)
        bugbtn.setOnClickListener{
            val intbug = Intent(this, bugActivity::class.java)
            startActivity(intbug)
        }

        val cmnissue: Button = findViewById(R.id.commenissuebtn)
        cmnissue.setOnClickListener{
            val intcmnissue = Intent(this, cmnvulActivity::class.java)
            startActivity(intcmnissue)
        }
        val toolbtn: Button = findViewById(R.id.toolbtn)
        toolbtn.setOnClickListener{
            val inttoolbtn = Intent(this,toolActivity::class.java)
            startActivity(inttoolbtn)
        }


    }
}
