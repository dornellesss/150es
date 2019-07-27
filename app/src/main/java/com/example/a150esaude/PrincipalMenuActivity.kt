package com.example.a150esaude

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_principal_menu.*
import kotlinx.android.synthetic.main.fragment_atividade.*

class PrincipalMenuActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item->
        when(item.itemId){
            R.id.cal_atividade-> {
                println("Atividades")
                replaceFragment(AtividadeFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.cal_acumulado-> {
                println("Pontos Acumulados")
                replaceFragment(AcumuladoFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.meus_pontos-> {
                println("Meus Pontos")
                replaceFragment(PontosFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_menu)
        val context = this



        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(AtividadeFragment())

    }

        private fun replaceFragment(fragment: Fragment){
            val fragmentTransaction =  supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.FragmentContainer, fragment)
            fragmentTransaction.commit()

    }


}
