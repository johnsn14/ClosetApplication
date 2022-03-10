package com.example.closet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ClosetDisplayPage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.closet_display_page)


        val addNewPhoto = findViewById<FloatingActionButton>(R.id.pick_image_button)
        addNewPhoto.setOnClickListener {
            val intent = Intent(this@ClosetDisplayPage, OpenCameraLibrary::class.java)
            startActivity(intent)

        }


        /*val shirt1 = findViewById<ImageView>(R.id.shirt1)
        shirt1.setOnClickListener() {
            startActivity(
                Intent(this@ClosetDisplayPage, Shirt1Activity::class.java).putExtra("name", "Black Shirt")
                    .putExtra("image", R.drawable.shirt1)
            )
        }

        val shirt2 = findViewById<ImageView>(R.id.shirt2)
        shirt2.setOnClickListener() {
            startActivity(
                Intent(this@ClosetDisplayPage, Shirt2Activity::class.java).putExtra("name", "BLue Shirt")
                    .putExtra("image", R.drawable.shirt2)
            )
        }
        */

        //val addNewClothing = findViewById<Button>(R.id.addNewClothingButton)
        //addNewClothing.setOnClickListener
        // {
        //   val intent = Intent(this@ClosetDisplayPage, EditClothingDetailsPage::class.java)
        //  startActivity(intent)
        //This button leads to the Upload Clothing page

    }
}
