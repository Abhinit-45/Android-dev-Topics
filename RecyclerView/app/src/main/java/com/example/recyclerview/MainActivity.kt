package com.example.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ContactLIstAdapter

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv:RecyclerView=findViewById(R.id.rv)

        val  contactlist= mutableListOf<Contact_item>()
            contactlist.add(
                Contact_item(
                    image = R.drawable.ic_launcher_background,
                    heading="Abhineet",
                    subheading = "Recent massage from Abhi"
                )
            )
        contactlist.add(
            Contact_item(
                image = R.drawable.faraj,
                heading="Faraj",
                subheading = "Bhai 2000rs ho to bhej de"

            )
        )
        contactlist.add(
            Contact_item(
                image = R.drawable.parmanand,
                heading="Parmanand",
                subheading = "22 ko aaa rha ghar se"
            )
        )
        contactlist.add(
            Contact_item(
                image = R.drawable.pandey,
                heading="Pandey ji",
                subheading = "Khana Bana rha hu ab"
            )
        )

        val adaptor=ContactLIstAdapter(contactlist)

        rv.layoutManager=LinearLayoutManager(this)
        rv.adapter=adaptor

       //create adaptor



    }
}