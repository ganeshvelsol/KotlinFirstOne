package app.school.gks.kotlinfirstone.roomdatabase

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Users
{
    @PrimaryKey
    var a:Int?=null

    @ColumnInfo(name="first_name")
    var firstame:String?=null

    @ColumnInfo(name="last_name")
    var lastName:String?=null


     constructor(a: Int?, firstame: String?, lastName: String?) {
        this.a = a
        this.firstame = firstame
        this.lastName = lastName
    }



}