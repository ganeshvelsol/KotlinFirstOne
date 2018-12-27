package app.school.gks.kotlinfirstone.roomdatabase

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(Users::class), version = 1)
public abstract class MyUserDatabase : RoomDatabase()
{
    abstract fun userDao(): UserDao
}