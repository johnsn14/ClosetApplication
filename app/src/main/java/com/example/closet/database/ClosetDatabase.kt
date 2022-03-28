package com.example.closet.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.closet.ClothingItem

/**
 * @Database is used to declare the class used to interact with the database.
 * @TypeConverters are needed to interact with Android's/Kotlin's specific datatypes that aren't recognized 
 * in SQLite.
 *
 * In the future, when the app is fully functioning with its Database the export schema will be released into the
 */

@Database (entities = [ClothingItem::class], version = 1)
@TypeConverters(ClosetTypeConverter::class)
abstract class ClosetDatabase : RoomDatabase()
{
    // Connecting the DAO to this class. Because ClosetDAO is an interface,
    // To call any information or functions from that DAO, use the instance generated below
    abstract fun closetDao(): ClosetDAO
}