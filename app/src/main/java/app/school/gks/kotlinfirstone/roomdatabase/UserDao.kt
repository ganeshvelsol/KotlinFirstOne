package app.school.gks.kotlinfirstone.roomdatabase

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert

@Dao
interface UserDao
{
    @Insert
    abstract fun addUser(user: Users)
}