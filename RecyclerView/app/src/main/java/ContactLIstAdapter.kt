package com.example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Contact_item
import com.example.recyclerview.R

class ContactLIstAdapter(
    private val contactItem:List<Contact_item>
):RecyclerView.Adapter<ContactLIstAdapter.ContactlistViewHolder>() {
   class ContactlistViewHolder(
   view:View
   ):RecyclerView.ViewHolder(view){

 val image:ImageView=view.findViewById(R.id.imgV)
       val textViewheading:TextView=view.findViewById(R.id.txtv)
       val textviewsubheading:TextView=view.findViewById(R.id.textsubheading)
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactlistViewHolder {

    val view=LayoutInflater.from(parent.context).inflate(R.layout.layout_rv_item,parent,false)
         return ContactlistViewHolder(view)
    }

    override fun getItemCount(): Int {

        return contactItem.size

    }

    override fun onBindViewHolder(holder: ContactlistViewHolder, position: Int) {
       holder.image.setImageResource(contactItem[position].image)
        holder.textViewheading.text=contactItem[position].heading
        holder.textviewsubheading.text=contactItem[position].subheading

    }


}