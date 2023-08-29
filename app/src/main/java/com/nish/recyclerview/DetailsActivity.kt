package com.nish.recyclerview

//import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.Button
import android.widget.ImageView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val image = intent.getIntExtra("image", R.drawable.tank_tops )
//        val name = intent.getStringExtra("activityName")

//        var button1 = findViewById<Button>(R.id.button1)
//        button1.setOnClickListener{
//            val intent1= Intent(this, InputActivity::class.java  )
//            startActivity(intent1 )
//        }


        val icon = findViewById<ImageView>(R.id.activity_icon)
        icon.setImageResource(image)
    }
}