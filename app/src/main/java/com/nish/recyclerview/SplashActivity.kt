package com.nish.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        Handler().postDelayed({
//            startActivity(Intent(this, MainActivity::class.java ) )
 //       finish()
//        }, 3000)
//

        val scope = CoroutineScope(Dispatchers.Main )
        scope.launch {
            delay(3000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java  ))
            finish()
        }
    }
}