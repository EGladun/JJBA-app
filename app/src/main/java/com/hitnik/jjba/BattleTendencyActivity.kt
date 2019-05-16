package com.hitnik.jjba

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_battle_tendency.*

class BattleTendencyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_battle_tendency)

        val mediaPlayer = MediaPlayer.create(this, R.raw.season2)
        mediaPlayer.start()

        backBT.setOnClickListener {
            val intent = Intent (this,MainActivity::class.java)
            mediaPlayer.pause()
            startActivity(intent)
        }

        joseph.setOnClickListener{
            val intent = Intent (this,HeroActivity::class.java)
            intent.putExtra("name","joseph")
            startActivity(intent)
        }

        lisalisa.setOnClickListener{
            val intent = Intent (this,HeroActivity::class.java)
            intent.putExtra("name","lisalisa")
            startActivity(intent)
        }

        cesar.setOnClickListener{
            val intent = Intent (this,HeroActivity::class.java)
            intent.putExtra("name","cesar")
            startActivity(intent)
        }

        shtroihaim.setOnClickListener{
            val intent = Intent (this,HeroActivity::class.java)
            intent.putExtra("name","shtroihaim")
            startActivity(intent)
        }

        kvatro.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name", "kvatro")
            startActivity(intent)
        }

        pillars.setOnClickListener {
            val intent = Intent(this, HeroActivity::class.java)
            intent.putExtra("name", "pillars")
            startActivity(intent)
        }
    }
}
