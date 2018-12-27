package app.school.gks.kotlinfirstone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SecondActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle?=intent.extras
        val name1: String=intent.getStringExtra("name")

        Toast.makeText(this,""+name1,Toast.LENGTH_LONG).show();

        val one = findViewById<Button>(R.id.one)
        val two = findViewById<Button>(R.id.two)
        val three = findViewById<Button>(R.id.three)
        val four = findViewById<Button>(R.id.four)
        val five = findViewById<Button>(R.id.five)
        val six = findViewById<Button>(R.id.six)
        val seven = findViewById<Button>(R.id.seven)
        val eight = findViewById<Button>(R.id.eight)
        val nine = findViewById<Button>(R.id.nine)
        val zero = findViewById<Button>(R.id.zero)
        val plus = findViewById<Button>(R.id.plus)
        val minus = findViewById<Button>(R.id.minus)
        val eqal = findViewById<Button>(R.id.eqal)
        val cross = findViewById<Button>(R.id.cross)
        val div = findViewById<Button>(R.id.div)

        val edit = findViewById<EditText>(R.id.et1)
        val edit2 = findViewById<EditText>(R.id.et2)

        one.setOnClickListener({
            val O_one: String=one.text.toString().trim()
        edit?.setText(O_one)
        })
        two.setOnClickListener({
            val t_two:String=two.text.toString().trim()
            edit?.setText(t_two)
        })

        three.setOnClickListener({
            val t_three:String=three.text.toString().trim()
            edit?.setText(t_three)
        })

        four.setOnClickListener({
            val f_four:String=four.text.toString().trim()
            edit?.setText(f_four)
        })
        five.setOnClickListener({
            val f_five:String=five.text.toString().trim()
            edit?.setText(f_five)
        })
        six.setOnClickListener({
            val s_six:String=six.text.toString().trim()
            edit?.setText(s_six)
        })
        seven.setOnClickListener({
            val s_seven:String=seven.text.toString().trim()
            edit?.setText(s_seven)
        })
        eight.setOnClickListener({
            val e_eight:String=eight.text.toString().trim()
            edit?.setText(e_eight)
        })

        nine.setOnClickListener({
            val n_nine:String=nine.text.toString().trim()
            edit?.setText(n_nine)
        })

        zero.setOnClickListener({
            val z_zero:String=zero.text.toString().trim()
            edit?.setText(z_zero)
        })

        plus.setOnClickListener({
            val edittext_two: String=edit.text.toString().trim()
            val ss:String="+"
            val d="$edittext_two $ss"

            edit2?.setText(d)
        })
    }
}
