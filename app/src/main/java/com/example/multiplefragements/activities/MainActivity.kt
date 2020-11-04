package com.example.multiplefragements.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multiplefragements.fragment.Fragement2
import com.example.multiplefragements.fragment.Fragment1
import com.example.multiplefragements.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_1.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }


    private fun init() {
        var switch: Boolean = true

            var fragmentManger = supportFragmentManager
            var fragmentTransaction = fragmentManger.beginTransaction()
            fragmentTransaction.add(R.id.fragement_container, Fragment1()).commit()




    }
}