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

        seasonAboutTxt.text = "1938 год. Во время экспедиции нацистов в Мексике, в ацтекских руинах было обнаружено множество «вампирских масок» (способных обращать людей в вампиров), а также окаменелый человек, «вмурованный» в колонну. Действие переносится в Нью-Йорк. Лабораторию обнаруживает уже постаревший Спидвагон и оказывается схваченным. Его отправляется искать Джозеф Джостар, внук Джонатана и обнаружив лабораторию, видит в них «Людей-из-колонны» (яп. 柱の男 хасира но отоко), которых нацисты пробуждают с помощью крови узников. Пробуждённое существо убивает всех работников лаборатории, однако терпит поражение от Джозефа. Тем временем пробуждаются ещё три древних Человека-из-колонн, которые намереваются найти древний «красный камень Эйши» (яп. エイジャの赤石 эйдзя но сэкисэки) для того, чтобы стать совершенными существами и вернуть господство над человечеством. Джозефу предстоит сражаться против них, а также познакомиться со своей матерью, которая, как думал Джозеф уже давно умерла."
    }
}
