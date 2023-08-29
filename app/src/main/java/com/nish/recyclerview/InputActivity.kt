package com.nish.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        var button2 = findViewById<Button>(R.id.move)
        button2.setOnClickListener{
            val intent2 = Intent (this, DetailsActivity::class.java)
            startActivity(intent2 )
        }

    }
    val key = "Key"
    fun Input(view: View) {
        val name =findViewById<TextView>(R.id.user_name)
        val description =findViewById<TextView>(R.id.description)
        val x =name.toString()
        val p =description .toString()

        val intkeActivity= Intent(this, InputActivity::class.java)
        intkeActivity .apply {putExtra(key,x,)}
        intkeActivity .apply {putExtra(key,p,)}
        startActivity(intkeActivity)
    }
}