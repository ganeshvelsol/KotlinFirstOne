package app.school.gks.kotlinfirstone.selectimage

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import app.school.gks.kotlinfirstone.R
import android.graphics.Bitmap
import android.R.attr.data
import android.support.v4.app.NotificationCompat.getExtras
import android.util.Log
import android.R.attr.data




class SelectImageActivity : AppCompatActivity()
{
     var display_image_view:ImageView?=null
    val reqcode:Int=100
    var bit:Bitmap?=null
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_image)

        inieprams();
    }
    fun inieprams()
    {
        display_image_view=findViewById(R.id.display_image_view)
        val select_image_textview=findViewById<TextView>(R.id.select_image_textview)
        select_image_textview.setOnClickListener({
            //here code to select an image from
            val intentPic=Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(intentPic,reqcode)


        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode)
        {
            reqcode ->
            {
                /*val b = data?.extras
                val bit:Bitmap = b?.get("data") as Bitmap
                display_image_view?.setImageBitmap(bit)*/

                val img = data?.getData()
                bit=MediaStore.Images.Media.getBitmap(this.getContentResolver(),img)
                display_image_view?.setImageBitmap(bit)


            }
        }
    }
}
