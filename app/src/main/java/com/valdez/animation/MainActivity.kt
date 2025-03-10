package com.valdez.animation

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_design)
    }

    fun rotate() {
        val image = findViewById<View>(R.id.image_dice)
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.rotate)

        image.startAnimation(animation)
    }
}
