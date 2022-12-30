package com.example.kidslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_image_viewer.*
import kotlinx.android.synthetic.main.activity_show_image.*

class ImageViewer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_viewer)
         var p:Int=intent.getIntExtra("body",-1000)
         var Arraysize:Int=intent.getIntExtra("size",-1000)
        val arrays= arrayOf(R.drawable.body1,R.drawable.body2,R.drawable.body3,R.drawable.body4,
            R.drawable.body5,R.drawable.body6,R.drawable.body7,R.drawable.body8,R.drawable.body9,
            R.drawable.body10,R.drawable.body,R.drawable.count1,R.drawable.count2,R.drawable.count3,
            R.drawable.count4,R.drawable.count6,R.drawable.fruit1, R.drawable.fruit2,R.drawable.fruit3,
            R.drawable.fruit4,R.drawable.fruit5,R.drawable.fruit6,R.drawable.fruit7, R.drawable.fruit8,
            R.drawable.family1,R.drawable.family2,R.drawable.family4,R.drawable.family5, R.drawable.day1,
            R.drawable.day2, R.drawable.day3, R.drawable.day4, R.drawable.day5, R.drawable.day6,R.drawable.day7,
            R.drawable.animal1,R.drawable.animal2,R.drawable.animal3,R.drawable.animal4,R.drawable.bird1,
            R.drawable.bird2,R.drawable.bird3,R.drawable.bird4,R.drawable.bird5,R.drawable.spice1,R.drawable.spice2,
            R.drawable.spice3,R.drawable.spice4,R.drawable.item1,R.drawable.item2,R.drawable.item3,R.drawable.item4,
            R.drawable.item5,R.drawable.item6,R.drawable.item7,R.drawable.item8,R.drawable.month4,R.drawable.month2,
            R.drawable.month3,R.drawable.month1,R.drawable.v1,R.drawable.v2,R.drawable.v3,R.drawable.v4,
            R.drawable.v5)


        imageShow2.setFactory {
            val imageview = ImageView(applicationContext)
            imageview.scaleType = ImageView.ScaleType.FIT_CENTER
            imageview
        }


            var posi=p
            if (posi==p){
                imageShow2.setImageResource(arrays[posi])
            }

        previewback.setOnClickListener {
            if (posi>p){
                posi-=1
                imageShow2.setImageResource(arrays[posi])
            }
        }

        pnext.setOnClickListener {
            if (posi<Arraysize){
                posi+=1
                imageShow2.setImageResource(arrays[posi])

            }
        }


back_button.setOnClickListener {
    startActivity(Intent(this,MainActivity::class.java))
}

    }
}


