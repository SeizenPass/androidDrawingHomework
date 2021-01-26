package com.example.kidsdrawingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ViewFlipper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawing_view.setSizeForBrush(20.toFloat())
        findViewById<ImageView>(R.id.ib_small_brush).setOnClickListener {
            drawing_view.setSizeForBrush(10.toFloat())
        }
        findViewById<ImageView>(R.id.ib_medium_brush).setOnClickListener {
            drawing_view.setSizeForBrush(20.toFloat())
        }
        findViewById<ImageView>(R.id.ib_large_brush).setOnClickListener {
            drawing_view.setSizeForBrush(30.toFloat())
        }

    }
}
