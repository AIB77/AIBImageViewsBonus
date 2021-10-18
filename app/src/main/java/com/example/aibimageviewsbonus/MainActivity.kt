package com.example.aibimageviewsbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var BTN1=findViewById<Button>(R.id.button1)
        var BTN2=findViewById<Button>(R.id.button2)
        var MyImage=findViewById<ImageView>(R.id.theimageView)


        BTN1.setOnClickListener {
            MyImage.setImageResource(R.drawable.image0)
        }
        BTN2.setOnClickListener {
            MyImage.setImageResource(R.drawable.image2)
        }



    }
}


