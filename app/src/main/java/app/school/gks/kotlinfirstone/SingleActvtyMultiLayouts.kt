package app.school.gks.kotlinfirstone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class SingleActvtyMultiLayouts : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_actvty_multi_layouts)
        initparams()
    }
     fun initparams()
    {
        val edit_user=findViewById<EditText>(R.id.edit_user)
        val edit_first_name=findViewById<EditText>(R.id.edit_first_name)



        val first_lnear=findViewById<LinearLayout>(R.id.first_lnear)
        val first_main_layout=findViewById<LinearLayout>(R.id.first_main_layout)

        val submit_btn = findViewById<Button>(R.id.submit_btn)


        submit_btn.setOnClickListener({
            val user:String=edit_user.text.toString().trim()
            val firstName:String=edit_first_name.text.toString().trim()

            if (user.isEmpty())
            {
                edit_user.requestFocus()
                edit_user.setError("enter user")
            }else if (firstName.isEmpty())
            {
                edit_first_name.requestFocus()
                edit_first_name.setError("enter first name")
            }
            else
            {
                //here code to inflate another layout(like second layout)
                val inflater = LayoutInflater.from(this@SingleActvtyMultiLayouts)
                val view = inflater.inflate(R.layout.second_layout, null)
                first_lnear.setVisibility(View.GONE)
                first_main_layout.addView(view)

                val edit_user_second=view.findViewById<EditText>(R.id.edit_user_second)
                val edit_first_name_second=view.findViewById<EditText>(R.id.edit_first_name_second)
                val edit_last_name_second=view.findViewById<EditText>(R.id.edit_last_name_second)
                val save_btn =view.findViewById<Button>(R.id.save_btn)

                save_btn.setOnClickListener({

                    val s1:String=edit_user_second.text.toString().trim()
                    val s2:String=edit_first_name_second.text.toString().trim()
                    val s3:String=edit_last_name_second.text.toString().trim()

                    if(s1.isEmpty())
                    {
                        edit_user_second.requestFocus()
                        edit_user_second.setError("enter field")
                    }else if (s2.isEmpty())
                    {
                        edit_first_name_second.requestFocus()
                        edit_first_name_second.setError("enter field")
                    }else if (s3.isEmpty())
                    {
                        edit_last_name_second.requestFocus()
                        edit_last_name_second.setError("enter this field")
                    }
                    else
                    {
                        Toast.makeText(this,""+user,Toast.LENGTH_SHORT).show()
                    }
                })

            }
        })
    }
}
