package com.example.kidslearningapp


import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_show_image.*

class ShowImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_image)
        val p=intent.getIntExtra("Abc",-200)
        var songposition=intent.getIntExtra("SongKey",-100)
        val array= arrayOf(R.drawable.aa,R.drawable.b,R.drawable.d,R.drawable.d,R.drawable.e,
            R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,
            R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,
            R.drawable.r,R.drawable.s,R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,
            R.drawable.x,R.drawable.y,R.drawable.z)
        val rowfile= arrayOf(R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,
            R.raw.i,R.raw.j,R.raw.k,R.raw.l,R.raw.m,R.raw.n,R.raw.o,R.raw.p,R.raw.q,R.raw.r,
            R.raw.s,R.raw.t,R.raw.u,R.raw.v,R.raw.w,R.raw.x,R.raw.y,R.raw.z)


        imageShow.setFactory {
            val imageview=ImageView(applicationContext)
            imageview.scaleType=ImageView.ScaleType.FIT_CENTER
            imageview

        }
        var Position=p
        if (Position==p) {

            imageShow.setImageResource(array[Position])
            val mediaPlayer = MediaPlayer.create(this,rowfile[songposition])
            mediaPlayer.start()



        }

        back.setOnClickListener {
            if (Position>0){
                Position-=1
                songposition-=1
                imageShow.setImageResource(array[Position])
                val mediaPlayer = MediaPlayer.create(this,rowfile[songposition])
                mediaPlayer.start()

            }

        }

        next.setOnClickListener {
            if (Position<array.size-1){
                Position+=1
                songposition+=1
                imageShow.setImageResource(array[Position])
                val mediaPlayer = MediaPlayer.create(this,rowfile[songposition])
                mediaPlayer.start()


            }
        }



    }

}