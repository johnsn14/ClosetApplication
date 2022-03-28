package com.example.closet

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

// class EditClothingDetailsPage : AppCompatActivity() {
//
//
// override fun onCreate(savedInstanceState: Bundle?) {
// super.onCreate(savedInstanceState)
// setContentView(R.layout.edit_clothing_details_page)
//
//
// val backButton = findViewById<Button>(R.id.backButton)
// backButton.setOnClickListener {
// val intent = Intent(this, MainClosetDisplayPage::class.java)
// startActivity(intent)
// }
//
//
// val clothingTypeSpinner: Spinner = findViewById(R.id.clothing_type_spinner)
// val clothingColorSpinner: Spinner = findViewById(R.id.clothing_color_spinner)
// //val clothingBrandSpinner: Spinner = findViewById(R.id.clothing_brand_spinner)
// //val clothingThemeSpinner: Spinner = findViewById(R.id.clothing_theme_spinner)
//
// // Create an ArrayAdapter using the string array and a default spinner layout
// //These functions effectively allow us to populate the spinners with items
// // made in strings.xml
// ArrayAdapter.createFromResource(
// this,
// R.array.clothing_type_array,
// android.R.layout.simple_spinner_item
// ).also { adapter ->
// // Specify the layout to use when the list of choices appears
// adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
// // Apply the adapter to the spinner
// clothingTypeSpinner.adapter = adapter
// }
//
// ArrayAdapter.createFromResource(
// this,
// R.array.clothing_color_array,
// android.R.layout.simple_spinner_item
// ).also { adapter ->
// // Specify the layout to use when the list of choices appears
// adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
// // Apply the adapter to the spinner
// clothingColorSpinner.adapter = adapter
// }
// /*
//
// ArrayAdapter.createFromResource(
// this,
// R.array.clothing_brand_array,
// android.R.layout.simple_spinner_item
// ).also { adapter ->
// // Specify the layout to use when the list of choices appears
// adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
// // Apply the adapter to the spinner
// clothingBrandSpinner.adapter = adapter
// }
//
// */
// /*
// ArrayAdapter.createFromResource(
// this,
// R.array.clothing_theme_array,
// android.R.layout.simple_spinner_item
// ).also { adapter ->
// // Specify the layout to use when the list of choices appears
// adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
// // Apply the adapter to the spinner
// clothingThemeSpinner.adapter = adapter
// }
// */
//
// //spinner.onItemSelectedListener = this
// }
//
// //Here is where we can grab input from selected spinner options.
// class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {
//
// override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
// // An item was selected. You can retrieve the selected item using
// // parent.getItemAtPosition(pos)
// }
//
// override fun onNothingSelected(parent: AdapterView<*>) {
// // Another interface callback
// }
// }
// }