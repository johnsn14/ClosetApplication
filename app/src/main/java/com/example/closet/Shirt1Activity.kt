package com.example.closet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent


class Shirt1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shirt1)


        /*
        var intent: Intent = intent;
        //for some reason intent is throwing errors. This is what makes the images clickable
        //and opens a new activity

        var intent image:Int = intent.getIntExtra("Image", 0)
        var String = intent.getStringExtra("name")!!

        imageView.setImageResource(image)
        textView.setText(name)
        */

    }
}