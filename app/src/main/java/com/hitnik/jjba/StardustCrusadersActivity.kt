package com.hitnik.jjba

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_stardust_crusaders.*

class StardustCrusadersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stardust_crusaders)

        val mediaPlayer = MediaPlayer.create(this, R.raw.season3)
        mediaPlayer.start()

        backSC.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            mediaPlayer.pause()
            startActivity(intent)
        }
    }
}