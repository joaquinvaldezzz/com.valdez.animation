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

    fun rotateClockwise(view: View) {
        val image = findViewById<View>(R.id.image_dice)
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.rotate_clockwise)

        image.startAnimation(animation)
    }

    fun rotateCounterclockwise(view: View) {
        val image = findViewById<View>(R.id.image_dice)
        val animation =
            AnimationUtils.loadAnimation(applicationContext, R.anim.rotate_counterclockwise)

        image.startAnimation(animation)
    }

    fun zoomIn(view: View) {
        val image = findViewById<View>(R.id.image_dice)
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_in)

        image.startAnimation(animation)
    }

    fun zoomOut(view: View) {
        val image = findViewById<View>(R.id.image_dice)
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)

        image.startAnimation(animation)
    }

    fun slideLeft(view: View) {
        val image = findViewById<View>(R.id.image_dice)
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_left)

        image.startAnimation(animation)
    }

    fun slideRight(view: View) {
        val image = findViewById<View>(R.id.image_dice)
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_right)

        image.startAnimation(animation)
    }
}
