package com.example.kidslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardAbcd.setOnClickListener {
            val intent=Intent(this,AII_alphabet::class.java)
            startActivity(intent)
        }
        bodyPart.setOnClickListener {
          information(0,10)
        }


        CountTable.setOnClickListener {
           information(11,15)
        }


        cardFruit.setOnClickListener {

            information(16,23)
        }


        cardFamily.setOnClickListener {
          information(24,27)

        }
        cardDays.setOnClickListener {
            information(28,34)
        }
       cardAnimals.setOnClickListener {
           information(35,38)
       }

        cardBirds.setOnClickListener {
            information(39,43)
        }

        cardSpices.setOnClickListener {
            information(44,47)
        }

        cardItems.setOnClickListener {
            information(48,55)
        }

        cardMonths.setOnClickListener {
            information(56,59)
        }
        cardVegetable.setOnClickListener {
            information(60,64)
        }


    }
    fun information( position:Int,arraysize:Int){
        val intent=Intent(this,ImageViewer::class.java)
        intent.putExtra("body",position)
        intent.putExtra("size",arraysize)
        startActivity(intent)
    }
    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Do you want to exit ?")
        builder.setTitle("Alert !")
        builder.setCancelable(false)
        builder.setPositiveButton("Yes") {
                dialog, which -> finish()
        }

        builder.setNegativeButton("No") {
                dialog, which -> dialog.cancel()
        }
        val alertDialog = builder.create()
        alertDialog.show()
    }

}