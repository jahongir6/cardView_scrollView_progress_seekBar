package com.example.progresbarcardviewvahk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* thread().start()*/ //bu yerda thread digan inner classimiz boshlansin deb
        // qoydim

        // bu seekbarni listener
        /*myseekbar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Log.d(TAG, "onProgressChanged: ")
                    // bu yerda boshlanadi
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Log.d(TAG, "onStartTrackingTouch: ")
                //bu yerda ushlab olib yurganda shu ishledi
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Log.d(TAG, "onStopTrackingTouch: ")
                // bu qoyvorganizda toxtedi
            }
        })*/
    }

    // bu yerda thread dan voris olib uning ichiga for siklda 0 dan yuzgacha deb olib
    // uning ichiga progresimizdi tenglab qoydim
    //va har bir sekunda siljsin deyapman
    // va pasda esa progress tolgandan kiyin korinme qosi didim
    // progress bar ning listeneri
    /*inner class thread : Thread() {
        override fun run() {
            for (i in 0 until 100) {
                myProgres.progress = i
                sleep(1000)
            }
            myProgres.visibility = View.INVISIBLE
        }
    }*/
}