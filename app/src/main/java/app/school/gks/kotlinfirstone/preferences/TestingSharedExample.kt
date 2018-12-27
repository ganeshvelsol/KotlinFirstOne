package app.school.gks.kotlinfirstone.preferences

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import app.school.gks.kotlinfirstone.R

class TestingSharedExample : AppCompatActivity()
{
     var send_btn:Button?=null
    var edit:EditText?=null
   // var pp=Preferences(this)

    var prf:SharedPreferences?=null
    var prf_ee:SharedPreferences.Editor?=null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testing_shared_example)

        prf=getSharedPreferences("hello", Context.MODE_PRIVATE)
        prf_ee= prf?.edit()
        val s=prf?.getString("hi",null)
        if (s?.length==0)
        {
            Toast.makeText(this, "" + s, Toast.LENGTH_LONG).show()
        }

//        if (pp?.getLoginCount()!==0)
//        {
//            Toast.makeText(this,""+pp?.getLoginCount(),Toast.LENGTH_LONG).show()
//        }
        initParams()
    }
   fun initParams()
    {
        send_btn=findViewById(R.id.send_btn)
        edit=findViewById(R.id.edit)

        send_btn?.setOnClickListener {
           // pp?.setLoginCount(edit?.text.toString().trim().toInt())

            prf_ee?.putString("hi",edit?.text.toString().trim())
            prf_ee?.apply()
            prf_ee?.commit()

        }





    }
}
