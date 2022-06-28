package com.example.ex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    private    var swith:Boolean =  false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView:ImageView=findViewById(R.id.imageview1)
        val button:Button=findViewById(R.id.btn1)

        button.setOnClickListener(  object :View.OnClickListener{
            override fun onClick(p0: View?) {

                 if(swith==false) {
                     imageView.setImageResource(R.drawable.bulb_on2);
                     button.setText("OFF")
                     swith =true;


                 }else{
                     imageView.setImageResource(R.drawable.bulb_off2)
                     button.setText("ON")
                     swith=false;
                 }
            }

        });



    }
}