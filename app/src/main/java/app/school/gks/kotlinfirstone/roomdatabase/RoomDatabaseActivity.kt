package app.school.gks.kotlinfirstone.roomdatabase

import android.arch.persistence.room.Room
import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import app.school.gks.kotlinfirstone.R

class RoomDatabaseActivity : AppCompatActivity()
{
    var name:String?=null
    var sp:SharedPreferences?=null
    var spe:SharedPreferences.Editor?=null

    var rr:MyUserDatabase?=null

    var username:EditText?=null
    var  enter_last:EditText?=null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_database)

//        spe=sp?.edit()
//        sp=getSharedPreferences("hello",Context.MODE_PRIVATE)
//        var st: String? =sp?.getString("h",null)
//
//        if (st?.length==0)
//        {
//
//        }else
//        {
//            Toast.makeText(this,st,Toast.LENGTH_LONG).show()
//        }
//
//        val username=findViewById<EditText>(R.id.username)
//        val save=findViewById<Button>(R.id.save)
//        save.setOnClickListener({
//            name=username.text.toString().trim()
//            spe?.putString("h",username.text.toString())
//            spe?.apply()
//            spe?.commit()
//        })


        username=findViewById<EditText>(R.id.username)
         enter_last=findViewById<EditText>(R.id.enter_last)
        val save=findViewById<Button>(R.id.save)
          rr = Room.databaseBuilder(this, MyUserDatabase::class.java, "simple")
                .allowMainThreadQueries().build()
        save.setOnClickListener {  dataPerform(); }


    }
    fun dataPerform()
    {
       var ss:String=username?.text.toString().trim()
        val ss1:String=enter_last?.text.toString().trim()
        try
        {
            rr?.userDao()?.addUser(Users(1,ss,ss1))
        }catch (e:Exception)
        {
            Toast.makeText(this,""+e,Toast.LENGTH_LONG).show()



            Toast.makeText(this,"hello",Toast.LENGTH_LONG).show()
        }
    }
}
