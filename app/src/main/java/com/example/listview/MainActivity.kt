package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.AdapterView.OnItemLongClickListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import java.lang.NullPointerException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview: ListView = findViewById(R.id.idLVLanguages)
        val edittext: EditText = findViewById(R.id.idEdtItemName)
        val butn: Button = findViewById(R.id.idBtnAdd)

        val listName = mutableListOf<String>("Abhi", "shashwat", "faraj", "happy", "sohan")
        val namesAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listName)
        //call the adapter
        listview.adapter = namesAdapter

        butn.setOnClickListener() {
            val name = edittext.text.toString()
            listName.add(name)
            namesAdapter.notifyDataSetChanged()

        }


        listview.setOnItemClickListener(object : OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                listName.removeAt(position)
                namesAdapter.notifyDataSetChanged()
            }

        })

    }
}