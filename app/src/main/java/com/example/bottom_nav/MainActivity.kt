package com.example.bottom_nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first = FirstFragment()
        val second = SecondFragment()
        val third = ThirdFragment()
        val four = FourthFragment()


        val bottom_nav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        replaceFragment(first)

        bottom_nav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.firstFragment -> replaceFragment(first)
                R.id.secondFragment -> replaceFragment(second)
                R.id.thirdFragment -> replaceFragment(third)
                R.id.fourthFragment -> replaceFragment(four)

            }
            true
        }


    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_layout, fragment)
            transaction.commit()
        }
    }



    override fun passData(editText: String) {
        val bundle = Bundle()
        bundle.putString("message", editText)
        val fragment_three = ThirdFragment()
        fragment_three.arguments = bundle


    }
}