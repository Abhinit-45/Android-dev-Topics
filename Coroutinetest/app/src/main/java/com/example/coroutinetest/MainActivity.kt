package com.example.coroutinetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var btn1: Button
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)

        btn1.setOnClickListener(){
            Toast.makeText(this,"Button ic Clicked",Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener(){
            //start some long running task
            //can potentialy block the UI

            GlobalScope.launch (Dispatchers.IO){
                
                //IO for background thread

                for (i in 0..1000000){
                    Log.i("Hello $i ",i.toString())
                }
            }



        }

    }
}