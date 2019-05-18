package com.hitnik.jjba

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phantomBlood.setOnClickListener {
            val intent = Intent (this, PhantomBloodActivity::class.java)
            startActivity(intent)
        }

        battleTendency.setOnClickListener {
            val intent = Intent (this,BattleTendencyActivity::class.java)
            startActivity(intent)
        }

        stardustCrusaders.setOnClickListener{
            val intent = Intent (this,StardustCrusadersActivity::class.java)
            startActivity(intent)
        }

        diamondIsUnbreakable.setOnClickListener {
            val intent = Intent (this,DiamondIsUnbreakableActivity::class.java)
            startActivity(intent)
        }

        ventoAureo.setOnClickListener {
            val intent = Intent (this, VentoAureoActivity::class.java)
            startActivity(intent)
        }

    }
    

}
