package com.kiran.softuserroomdatabase.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kiran.softuserroomdatabase.entity.User

@Dao
interface UserDAO {
    @Insert
    suspend fun registerUser(user: User)

    @Query("select * from User where username=(:username) and password=(:password)")
    suspend fun checkUser(username: String, password: String): User
}