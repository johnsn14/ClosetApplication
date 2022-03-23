package com.example.closet.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import java.util.*

/**
 * **This class file is currently waiting on a list of objects once we start
 *      creating the classes that grab data. **
 *
 *  DAO = Data Access Object - an interface class tha contains the functions to edit and
 *                      interact with the data for each database operation.
 *
 */
@Dao
interface ClosetDAO {
    //Example of how this would work.
    /*
    @Query ("SELECT * FROM user")
    fun getUser(): List<user>
    */
    // This will pull all columns for all rows in the Closet Database table.
    @Query("SELECT * FROM ClothingItem")
    fun getClothingItems(): LiveData<List<ClothingItem>>
    //This pulls all Columns for ONLY ONE row whose id matches the ID value provided.
    @Query("SELECT * FROM ClothingItem WHERE Clothing_item_id=(:id)")
    fun getClothingItem(id: UUID): LiveData<ClothingItem?>
}