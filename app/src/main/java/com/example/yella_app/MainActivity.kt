package com.example.yella_app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //membuat aksi ketika button di klik
        val tombolAksi: Button = findViewById(R.id.textButton)
        tombolAksi.setOnClickListener {
            ubahTeks()
        }

    }



//fungsi ketika tombol di klik akan di panggil fungsi ini
private fun ubahTeks () {
    Toast.makeText(this , "button clicked",
    Toast.LENGTH_SHORT).show()



    //mengubah gambar
    val txthello: TextView = findViewById(R.id.txthello)
    val image1: ImageView = findViewById(R.id.imageView1)
    isiGambar(txthello,image1)

    val txtdadu2: TextView = findViewById(R.id.txtdadu2)
    val image2: ImageView = findViewById(R.id.imageView2)
    isiGambar(txtdadu2,image2)


    val txtdadu3: TextView = findViewById(R.id.txtdadu3)
    val image3: ImageView = findViewById(R.id.imageView3)
    isiGambar(txtdadu3,image3)

}

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun isiGambar(txthello: TextView, image1: ImageView){
        val tes = (1 until 6).random()
        txthello.text = tes.toString()

        when (tes) {

            1 -> image1.setImageDrawable(getDrawable(R.drawable.gambar1))
            2 -> image1.setImageDrawable(getDrawable(R.drawable.gambar2))
            3 -> image1.setImageDrawable(getDrawable(R.drawable.gambar3))
            4 -> image1.setImageDrawable(getDrawable(R.drawable.gambar4))
            5 -> image1.setImageDrawable(getDrawable(R.drawable.gambar5))
            else -> { // Note the block
                image1.setImageDrawable(getDrawable(R.drawable.gambar6))
            }
        }
    }



    fun pindahPage(view:View ) {
        val intent = Intent(this, ListMovie::class.java).apply {
            // putExtra(, message)
        }
        startActivity(intent)
    }



}
