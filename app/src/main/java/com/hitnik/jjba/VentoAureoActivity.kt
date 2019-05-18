package com.hitnik.jjba

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_vento_aureo.*

class VentoAureoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vento_aureo)

        val mediaPlayer = MediaPlayer.create(this, R.raw.season5)
        mediaPlayer.start()

        backVA.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            mediaPlayer.pause()
            startActivity(intent)
        }
    }


}
