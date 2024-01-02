package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.myapp.fragment.Fragment_home
import com.google.android.material.bottomnavigation.BottomNavigationView
//import com.example.myapp.coordinator.dataCoordinator.sampleAPI


class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    private  lateinit var fragment: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView = findViewById(R.id.menu);




        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menuhome -> {
                    fragment = Fragment_home()
                }
                R.id.menudashboard -> {
                    fragment = Fragment_home()
                }
                R.id.menucart -> {
                    fragment = Fragment_home()
                }
                R.id.menupeople -> {
                    fragment = Fragment_home()
                }
            }
            LOAD_FRAGMENT(fragment)
            false
        }
    }

    private fun LOAD_FRAGMENT(fragment: Fragment) {
//        sampleAPI(
//            email= "khoa@gmail.com",
//            onSuccess = {},
//            onError = {}
//        )
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayout, fragment!!)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}