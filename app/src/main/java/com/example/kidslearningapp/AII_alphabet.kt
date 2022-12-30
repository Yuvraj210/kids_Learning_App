package com.example.kidslearningapp

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_aii_alphabet.*
import kotlinx.android.synthetic.main.activity_show_image.*

class AII_alphabet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aii_alphabet)



        cardA.setOnClickListener {
            Alphabet(0,0)
}

        cardB.setOnClickListener {
            Alphabet(1,1)
    }

        cardC.setOnClickListener {
            Alphabet(2,2)
        }


        cardD.setOnClickListener {
            Alphabet(3,3)
        }


        cardE.setOnClickListener {
            Alphabet(4,4)
        }


        cardF.setOnClickListener {
            Alphabet(5,5)
        }


        cardG.setOnClickListener {
            Alphabet(6,6)
        }


        cardH.setOnClickListener {
            Alphabet(7,7)
        }


        cardI.setOnClickListener {
            Alphabet(8,8)
        }


        cardJ.setOnClickListener {
            Alphabet(9,9)
        }


        cardK.setOnClickListener {
            Alphabet(10,10)
        }


        cardL.setOnClickListener {
            Alphabet(11,11)
        }


        cardM.setOnClickListener {
            Alphabet(12,12)
        }


        cardN.setOnClickListener {
            Alphabet(13,13)
        }


        cardO.setOnClickListener {
            Alphabet(14,14)
        }


        cardP.setOnClickListener {
            Alphabet(15,15)
        }


        cardQ.setOnClickListener {
            Alphabet(16,16)
        }


        cardR.setOnClickListener {
            Alphabet(17,17)
        }


        cardS.setOnClickListener {
            Alphabet(18,18)
        }


        cardT.setOnClickListener {
            Alphabet(19,19)
        }



        cardU.setOnClickListener {
            Alphabet(20,20)
        }


        cardV.setOnClickListener {
            Alphabet(21,21)
        }


        cardW.setOnClickListener {
            Alphabet(22,22)
        }



        cardX.setOnClickListener {
            Alphabet(23,23)
        }



        cardY.setOnClickListener {
            Alphabet(24,24)
        }



        cardZ.setOnClickListener {
            Alphabet(25,25)
        }
}
    fun Alphabet(Position:Int,song:Int){
        val intent = Intent(this, ShowImage::class.java)
        intent.putExtra("Abc",Position)
        intent.putExtra("SongKey",song);
        startActivity(intent)


    }
}


