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

        val mediaPlayerThree = MediaPlayer.create(this, R.raw.season3)
        mediaPlayerThree.start()

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
            mediaPlayerThree.pause()
            startActivity(intent)
        }

        seasonAboutTxt.text = "Действие происходит в 1989 году. Моряки вытаскивают сундук с телом Дио Брандо со дна атлантического океана, который покоился там 100 лет, он оживает и убивает моряков. Становится ясно, что Дио сумел захватить тело Джонатана, которым заменил своё, ранее уничтоженное. По этой причине у всех потомков Джонатана пробуждаются «стенды» (яп. スタンド сутандо) — существа, являющиеся воплощением духовной сущности, воли человека и обладающие разными способностями. Их получают Джозеф Джостар, его дочь Холли Кудзё и внук Дзётаро Кудзё. Холли однако не может справиться со своей новой силой и начинает медленно умирать, по прогнозам врачей она должна умереть примерно через 50 дней. Единственный способ спасти Холли — убить Дио до истечения данного срока. Так постаревший Джозеф ищет помощи у своего внука Дзётаро, чтобы вместе с ним отправиться в Египет и убить как можно скорее Дио. К ним присоединяются Мохаммед Абдул, Нориаки Какёин, Жан-Пьер-Польнарефф и собака Игги. Вместе они сражаются против Дио и его подчинённых, путешествуя по странам Южной Азии и Ближнего Востока, таких, как Сингапур, Индия, Пакистан, Саудовская Аравия и Египет."
    }
}
