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

        val mediaPlayerOne = MediaPlayer.create(this, R.raw.season1)
        mediaPlayerOne.start()

        backPB.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            mediaPlayerOne.pause()
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

        seasonAboutTxt.text = "Действие происходит в Великобритании, во второй половине XIX века. Вор-алкоголик находит разбитую повозку богатого человека и выдаёт себя за спасителя. В знак благодарности Джордж Джостар позже принимает в семью сына вора — Дио Брандо, который с первой встречи невзлюбил Джонатана, сына Джорджа, и решает всеми способами испортить ему жизнь, для чего прибегает к самым подлым методам. Однако Джонатан не падает духом. Проходит 8 лет; отец смертельно заболевает, но выясняется, что на самом деле Дио, желающий получить наследство, подсыпал отчиму яд. Джонатан раскрывает преступление и нападает на Дио. Тот решает испытать на себе таинственную маску, которая превращает его в вампира. Поместье сожжено дотла, Джонатан отправляется в путешествие и встречается с Уиллом Цеппели, который обучает главного героя технике «Хамон» (яп. 波紋 Хамон), с помощью которой можно победить нежить, а также Робертом Спидвагоном, бывшим разбойником. Так Джонатан, находя новых союзников, начинает борьбу против Дио и его новых слуг-мертвецов. Дио сначала обращает Джека Потрошителя, а затем давно умерших рыцарей Таркуса и Бруфорда."



    }
}
