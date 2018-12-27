package app.school.gks.kotlinfirstone

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit_btn.setOnClickListener{
            if (medit.text.toString().trim().isEmpty())
            {

                medit.requestFocus()
                medit.setError("enter name here");
            }else if (medit1.text.toString().trim().isEmpty())
            {
                medit1.requestFocus();
                medit.setError("enter name here");

            }
            else
            {
                Toast.makeText(this,"success",Toast.LENGTH_LONG).show();
                //(Intent(this,SecondActivity::class.java))
                val intent=Intent(this,SecondActivity::class.java);
                intent.putExtra("name","sanju");
                startActivity(intent)
            }

        }
    }
}
