package com.example.kidsdrawingapp

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ViewFlipper
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_brush_color.*
import kotlinx.android.synthetic.main.dialog_brush_size.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawing_view.setSizeForBrush(20.toFloat())

        ib_brush.setOnClickListener{
            showBrushSizeChooserDialog()
        }

        val bBlack = findViewById<ImageButton>(R.id.bBlack)
        bBlack.setOnClickListener {
            drawing_view.setColorForBrush(Color.BLACK)
        }
        val bGreen = findViewById<ImageButton>(R.id.bGreen)
        bGreen.setOnClickListener {
            setColorEvent( "#0FC559")
        }
        val bRed = findViewById<ImageButton>(R.id.bRed)
        bRed.setOnClickListener{
            setColorEvent("#C52A0F")
        }
        val bYellow = findViewById<ImageButton>(R.id.bYellow)
        bYellow.setOnClickListener{
            setColorEvent( "#F4D03F")
        }
        val bPurple = findViewById<ImageButton>(R.id.bPurple)
        bPurple.setOnClickListener{
            setColorEvent( "#8E44AD")
        }
        val bWhite = findViewById<ImageButton>(R.id.bWhite)
        bWhite.setOnClickListener{
            setColorEvent( "#F0F3F4")
        }
        val bBlue = findViewById<ImageButton>(R.id.bBlue)
        bBlue.setOnClickListener{
            setColorEvent( "#3498DB")
        }
        val bEraser = findViewById<ImageButton>(R.id.bEraser)
        bEraser.setOnClickListener{
            setColorEvent( "#FFFFFF")
        }
    }

    private fun showBrushSizeChooserDialog(){
        val brushDialog = Dialog(this)
        brushDialog.setContentView(R.layout.dialog_brush_size)
        brushDialog.setTitle("Brush size: ")
        val smallBtn = brushDialog.ib_small_brush
        smallBtn.setOnClickListener {
            drawing_view.setSizeForBrush(10.toFloat())
            brushDialog.dismiss()
        }
        val mediumBtn = brushDialog.ib_medium_brush
        mediumBtn.setOnClickListener {
            drawing_view.setSizeForBrush(20.toFloat())
            brushDialog.dismiss()
        }
        val largeBtn = brushDialog.ib_large_brush
        largeBtn.setOnClickListener {
            drawing_view.setSizeForBrush(30.toFloat())
            brushDialog.dismiss()
        }
        brushDialog.show()


    }


    private fun setColorEvent(color: String) {
        drawing_view.setColorForBrush(Color.parseColor(color));
    }
}
