package com.example.closet.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 * First Entity will resemble User
 * PK = user_id, int, Not Null
 *      first_name, VarChar, Not Null
 *      last_name, VarChar, NotNull
 *      password, VarChar, NotNull
 *      email, VarChar, NotNull
 */
@Entity
data class User (@PrimaryKey val id: UUID = UUID.randomUUID(),
                val firstName: String = "",
                val lastName: String = "",
                val password: String = "",
                val email: String = "")
{
}