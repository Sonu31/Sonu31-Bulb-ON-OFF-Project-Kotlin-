package com.example.ex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imageView:ImageView=findViewById(R.id.image1)
        val imageView2:ImageView=findViewById(R.id.image2)

        val button:Button=findViewById(R.id.btn1)
        val button2:Button=findViewById(R.id.btn2)


        button.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?) {
             imageView.setImageResource(R.drawable.bulb_on2)

            }
        })
        button2.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?) {
                imageView.setImageResource(R.drawable.bulb_off2)

            }
        })


    }
}