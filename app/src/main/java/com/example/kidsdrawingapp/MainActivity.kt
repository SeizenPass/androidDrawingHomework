package com.example.kidsdrawingapp

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

        ib_paint.setOnClickListener{
            showBrushColorChooserDialog()
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

    private fun showBrushColorChooserDialog() {
        val brushDialog = Dialog(this)

        brushDialog.setContentView(R.layout.dialog_brush_color)

        brushDialog.setTitle("Brush color: ")
        val bBlack = brushDialog.bBlack
        bBlack.setOnClickListener {
            drawing_view.setColorForBrush(Color.BLACK)
            brushDialog.dismiss()
        }
        val bGreen = brushDialog.bGreen
        bGreen.setOnClickListener {
            setColorEvent(brushDialog, "#0FC559")
        }
        val bRed = brushDialog.bRed
        bRed.setOnClickListener{
            setColorEvent(brushDialog, "#C52A0F")
        }
        val bYellow = brushDialog.bYellow
        bYellow.setOnClickListener{
            setColorEvent(brushDialog, "#F4D03F")
        }
        val bPurple = brushDialog.bPurple
        bPurple.setOnClickListener{
            setColorEvent(brushDialog, "#8E44AD")
        }
        val bWhite = brushDialog.bWhite
        bWhite.setOnClickListener{
            setColorEvent(brushDialog, "#F0F3F4")
        }
        val bBlue = brushDialog.bBlue
        bBlue.setOnClickListener{
            setColorEvent(brushDialog, "#3498DB")
        }
        brushDialog.show()
    }

    private fun setColorEvent(dialog: Dialog,color: String) {
        drawing_view.setColorForBrush(Color.parseColor(color));
        dialog.dismiss();
    }
}
