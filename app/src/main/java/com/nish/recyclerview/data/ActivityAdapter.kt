package com.nish.recyclerview.data

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.nish.recyclerview.DetailsActivity
import com.nish.recyclerview.R

class ActivityAdapter(var context:Context, var list:ArrayList<ActivityModel>): RecyclerView .Adapter<ActivityAdapter.ActivityViewHolder>()  {

    //create another class in here
    class ActivityViewHolder(itemView: View):ViewHolder(itemView ) {
        val image = itemView.findViewById<ImageView>(R.id.activity_image)
        val name = itemView .findViewById<TextView>(R.id.activity_name)
        val time = itemView .findViewById<TextView>(R.id.activity_time)

        val card = itemView .findViewById<CardView>(R.id.my_card )
    }


 //RecyclerView we only import 3 functions but in list and Grid View we import 4 functions
    //onCreateViewHolder helps us to create the view holder of elements in our item layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, null, false )
         return ActivityViewHolder(view)
    }
    //getItemCount gets the number of elements we want to display in our Activity main
    override fun getItemCount(): Int {
        return list.size
    }
// this is where we connect our view to our data
    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.name.text = list[position].activityName
        holder.time.text = list[position].activityTime

          //put the button click
         holder.card.setOnClickListener {
             val intent = Intent (context, DetailsActivity:: class.java )
             intent.putExtra("image", list[position].image )
             context.startActivity(intent)
         }
    }
}