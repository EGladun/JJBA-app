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

        backDIU.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            mediaPlayer.pause()
            startActivity(intent)
        }
    }
}
