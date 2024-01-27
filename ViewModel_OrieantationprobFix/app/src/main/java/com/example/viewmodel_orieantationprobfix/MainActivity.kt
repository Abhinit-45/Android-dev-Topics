package com.example.viewmodel_orieantationprobfix

import android.app.ActivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel_orieantationprobfix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var viewModel:MainActivityViewModel
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.txt.text=viewModel.getCurrentCount().toString()

        binding.btn.setOnClickListener(){

            binding.txt.text=viewModel.getupdatedCount().toString()

        }
    }
}