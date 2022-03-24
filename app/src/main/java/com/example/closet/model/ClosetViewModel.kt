package com.example.closet.model

import androidx.lifecycle.ViewModel

import com.example.closet.database.ClosetRepository

class ClosetViewModel: ViewModel() {

    private val closetRepository = ClosetRepository.get()
    //Why is this erroring? IS the error in ClosetRepo or Closet Model?
    val clothingItemListLiveData = closetRepository.getClothingItems()
}