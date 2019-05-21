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

        val mediaPlayerFour = MediaPlayer.create(this, R.raw.season4)
        mediaPlayerFour.start()

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

        seasonAboutTxt.text = "Действие происходит в Японии 1999 года, в вымышленном городе Морио, где живёт Дзёсукэ Хигасиката, внебрачный сын Джозефа. С ним связывается Дзётаро Кудзё, ближний родственник, чтобы известить о наличии наследства, которые Дзёсукэ может получить от своего отца. Сам Дзёсукэ владеет стендом и долгое время думал, что является единственным носителем подобной силы. Дзёсукэ расправляется с первым противником со стендом — Анджело, но узнаёт от него, что в городе есть владелец волшебных артефактов — лука и стрелы, которые пронзая человека, наделяют его силой стенда. Дзёсукэ быстро находит их владельцев, которыми оказываются братья Кэйтё и Окуясу. Создавая новых владельцев стендом, они надеялись излечить своего отца, однако Кэйтё убивает стенд Red Hot Chili Pepper, который принадлежит Акире Отоиси и крадёт лук со стрелой. Окуясу решает следовать за Дзёсукэ. Главные герои снова пытаются найти нового владельца лука и стрелы, чтобы избежать появления новых владельцев стендов.\n" +
                "\n" +
                "Во второй части манги Дзёсукэ и его союзники пытаются найти и расправиться с серийным убийцей по имени Ёсикагэ Кира, который убивает женщин, чтобы потом ухаживать за их отрубленными руками. Сам Кира, чтобы скрыться от преследования, изменяет себе внешность на убитого им Косаку Кавадзири, офисного клерка, мужа и отца. Кажется, что Кира спрятался надёжно, но его начинает подозревать сын Косаку — Хаято, который может стать ключом к тому, что Дзёсукэ удастся найти серийного убийцу и спасти жизнь его будущих жертв."




        backDIU.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            mediaPlayerFour.pause()
            startActivity(intent)
        }
    }
}
