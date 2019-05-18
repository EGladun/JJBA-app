package com.hitnik.jjba

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_diamond_is_unbreakable.*

class DiamondIsUnbreakableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diamond_is_unbreakable)

        val mediaPlayer = MediaPlayer.create(this, R.raw.season4)
        mediaPlayer.start()

        josuke.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","josuke")
            startActivity(intent)
        }

        koichi.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","koichi")
            startActivity(intent)
        }

        okuyasu.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","okuyasu")
            startActivity(intent)
        }

        rohan.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","rohan")
            startActivity(intent)
        }
        kira.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","kira")
            startActivity(intent)
        }

        andzuro.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","andzuro")
            startActivity(intent)
        }

        ukako.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","ukako")
            startActivity(intent)
        }

        tomoko.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","tomoko")
            startActivity(intent)
        }

        otoishi.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","otoishi")
            startActivity(intent)
        }

        kobayashi.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","kobayashi")
            startActivity(intent)
        }

        hadzamada.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","hadzamada")
            startActivity(intent)
        }

        yandzo.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","yandzo")
            startActivity(intent)
        }

        remi.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","remi")
            startActivity(intent)
        }

        aya.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","aya")
            startActivity(intent)
        }

        hadzekura.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","hadzekura")
            startActivity(intent)
        }

        sidzuka.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name","sidzuka")
            startActivity(intent)
        }




        backDIU.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            mediaPlayer.pause()
            startActivity(intent)
        }
    }
}
