package com.example.closet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.material.floatingactionbutton.FloatingActionButton


class OpenCameraLibrary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_open_camera_library)
        setContentView(R.layout.activity_open_camera_library)
        setClickListeners()

        val addNewClothingItem = findViewById<Button>(R.id.backButton)
        addNewClothingItem.setOnClickListener {
           // val intent = Intent(this@OpenCameraLibrary, EditClothingDetailsPage::class.java)
            //startActivity(intent)

        }
    }


    private val selectImageFromGalleryResult = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        uri?.let { previewImage.setImageURI(uri) }
    }

    private val previewImage by lazy { findViewById<ImageView>(R.id.image_preview) }

    private fun setClickListeners() {
        findViewById<FloatingActionButton>(R.id.pick_image_button).setOnClickListener {
            selectImageFromGallery()
        }
    }
    private fun selectImageFromGallery() = selectImageFromGalleryResult.launch("image/*")
}