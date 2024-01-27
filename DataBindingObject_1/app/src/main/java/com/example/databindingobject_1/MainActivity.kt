package com.example.databindingobject_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingobject_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var user1: User = User(1, "Abhi", "1117")
        binding.user=user1

    //not need these code becouse data class is directoly linked with XML file using <data> as shown in XMl code
    //   binding.apply {
    //     txt1.setText(user1.id)
    //  txt2.setText(user1.name)
    //  txt3.setText(user1.password)

        }
}
