package com.hitnik.jjba

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hero.*
import kotlinx.android.synthetic.main.activity_stardust_crusaders.*

class StardustCrusadersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stardust_crusaders)

        val mediaPlayer = MediaPlayer.create(this, R.raw.season3)
        mediaPlayer.start()

        jotaro.setOnClickListener {
            val intent = Intent (this,HeroActivity::class.java)
            intent.putExtra("name","jotaro")
            startActivity(intent)
        }

        holly.setOnClickListener{
            val intent = Intent (this,HeroActivity::class.java)
            intent.putExtra("name","holly")
            startActivity(intent)
        }

        abdul.setOnClickListener {
            val intent = Intent(this,HeroActivity::class.java)
            intent.putExtra("name","abdul")
            startActivity(intent)
        }

        kakyoin.setOnClickListener {
            val intent = Intent(this,HeroActivity::class.java)
            intent.putExtra("name","kakyoin")
            startActivity(intent)
        }

        polnareff.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","polnareff")
            startActivity(intent)
        }

        iggi.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","iggi")
            startActivity(intent)
        }

        horse.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","horse")
            startActivity(intent)
        }

        geil.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","geil")
            startActivity(intent)
        }

        nena.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","nena")
            startActivity(intent)
        }

        enya.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","enya")
            startActivity(intent)
        }

        petshop.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","petshop")
            startActivity(intent)
        }

        vanilla.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","vanilla")
            startActivity(intent)
        }


        backSC.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            mediaPlayer.pause()
            startActivity(intent)
        }
    }
}
