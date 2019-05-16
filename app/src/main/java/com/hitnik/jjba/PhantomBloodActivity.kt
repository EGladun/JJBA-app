package com.hitnik.jjba

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phantom_blood.*

class PhantomBloodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phantom_blood)

        val mediaPlayer = MediaPlayer.create(this, R.raw.season1)
        mediaPlayer.start()

        backPB.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            mediaPlayer.pause()
            startActivity(intent)
        }

        dio.setOnClickListener{
            val intent = Intent (this,HeroActivity::class.java)
            intent.putExtra("name","dio")
            startActivity(intent)
        }

        jonathan.setOnClickListener{
            val intent = Intent (this,HeroActivity::class.java)
            intent.putExtra("name","jonathan")
            startActivity(intent)
        }

        erina.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name", "erina")
            startActivity(intent)
        }

        spidwagon.setOnClickListener{
            val intent = Intent(this,HeroActivity::class.java)
            intent.putExtra("name","spidwagon")
            startActivity(intent)
        }

        uill.setOnClickListener {
            val intent = Intent(this,HeroActivity::class.java)
            intent.putExtra("name","uill")
            startActivity(intent)
        }

        george.setOnClickListener {
            val intent = Intent(this,HeroActivity::class.java)
            intent.putExtra("name","george")
            startActivity(intent)
        }

        dario.setOnClickListener {
            val intent = Intent (this,HeroActivity::class.java)
            intent.putExtra("name","dario")
            startActivity(intent)
        }

    }
}
