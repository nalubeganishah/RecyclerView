package com.nish.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nish.recyclerview.data.ActivityAdapter
import com.nish.recyclerview.data.ActivityModel
import com.nish.recyclerview.data.ActivityStatus

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //here we attach our adapter to main activity or Recycler view
        val list = ArrayList<ActivityModel>()
        list.add(ActivityModel(R.drawable.cut_and_sew_hoodie, "Check Mails", "9:10am", "Check and reply important emails concerning sales, meetings and many more", ActivityStatus.Pending ))
        list.add(ActivityModel(R.drawable.athletic_shorts, "Check Losses", "10:00am", "Check losses and profits", ActivityStatus.Pending ))
        list.add(ActivityModel(R.drawable.lady_top, "Review Stock", "3:10pm", "reviewing the available stock", ActivityStatus.Pending ))
        list.add(ActivityModel(R.drawable.print_shirt, "Review Sales", "12:00am", "reviewing sales to know the trusted clients", ActivityStatus.Pending ))
        list.add(ActivityModel(R.drawable.tank_tops, "Taking Stock", "1:05am", "Checking the available stock over sales", ActivityStatus.Pending ))
        list.add(ActivityModel(R.drawable.cut_and_sew_hoodie, "Check Carts", "6:10pm", "Checking items available in carts", ActivityStatus.Pending ))
        list.add(ActivityModel(R.drawable.tank_tops, "Take Orders", "5:30pm", "Accepting and reviewing clients orders", ActivityStatus.Pending ))

        val activityAdapter = ActivityAdapter (this, list)
        //attach the Recycler view to the adapter
        val recyclerView = findViewById<RecyclerView> (R.id.recyclerView)
        recyclerView .adapter = activityAdapter
        //attach Recyclers view to layout manager
        recyclerView .layoutManager = LinearLayoutManager(this)



    }
}