package com.heydarklord.androidhunt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class TrainGActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_train_g)

        val logbtn:  Button = findViewById(R.id.log1)
        logbtn.setOnClickListener{
            val logint = Intent(this,LoggingActivity::class.java)
            startActivity(logint)
        }
        val pridir:  Button = findViewById(R.id.pridir)
        pridir.setOnClickListener{
            val logpir = Intent(this,privateActivity::class.java)
            startActivity(logpir)
        }

        val sbtn: Button = findViewById(R.id.source)
        sbtn.setOnClickListener{
            Toast.makeText(this,"Please Check String And Android Manifest Xml",Toast.LENGTH_LONG).show()
        }

        val classes: Button = findViewById(R.id.classes)
        classes.setOnClickListener{
            Toast.makeText(this,"Please Check Private Activity",Toast.LENGTH_LONG).show()
        }

    }
}
