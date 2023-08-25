package com.nish.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecyclerListener
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ActivityAdapter(var context:Context, var list:ArrayList<ActivityModel >): RecyclerView .Adapter<ActivityAdapter.ActivityViewHolder>()  {

    //create another class in here
    class ActivityViewHolder(itemView: View):ViewHolder(itemView ) {
        val image = itemView.findViewById<ImageView>(R.id.activity_image )
        val name = itemView .findViewById<TextView>(R.id.activity_name)
        val time = itemView .findViewById<TextView>(R.id.activity_time)
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
    }
}