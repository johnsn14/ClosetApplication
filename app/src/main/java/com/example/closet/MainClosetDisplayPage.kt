package com.example.closet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainClosetDisplayPage : AppCompatActivity(),
    ClosetListFragment.Callbacks {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            //
            setContentView(R.layout.activity_main)

            //This grabs the id for Constraint Layout of edit_clothing_details_page.xml
            val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

            if (currentFragment == null) {
                val fragment = ClosetListFragment.newInstance()
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container,fragment)
                    .commit()
            }

        }
        override fun onClothingItemSelected(clothingItemId: UUID) {
            val fragment = EditClothingPageFragment.newInstance(clothingItemId)
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

    /**
     * This was removed Temporarily due to interferring with Fragment. Eventually I will add it to the Fragment above.
     */
    /*val addNewPhoto = findViewById<FloatingActionButton>(R.id.pick_image_button)
    addNewPhoto.setOnClickListener {
             val intent = Intent(this@MainClosetDisplayPage, OpenCameraLibrary::class.java)
              startActivity(intent)
        }

     */
}

