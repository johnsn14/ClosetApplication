package com.example.closet.database

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.util.*

/**
 * This class will be used to grab data from the entities if anything needs to be converted.
 * Type converter tells @Room how to convert a specific type to the format it needs to store in the database.
 *
 * The following @TypeConverters() is on @ClosetDatabase.kt file to explicitly add
 * the the converters to the database class.
 */
class ClosetTypeConverter {
    // Will tell @Room how to convert the type to store in the database
    @TypeConverter
    fun toUUID(uuid: String?): UUID? {
        return UUID.fromString(uuid)
    }
    // Will tell @Room how to convert from the database back into the UUID format to use in Android/Kotlin.
    @TypeConverter
    fun fromUUID(uuid: UUID?): String? {
        return uuid?.toString()
    }

}