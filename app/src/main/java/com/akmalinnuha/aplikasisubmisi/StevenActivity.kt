package com.akmalinnuha.aplikasisubmisi

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.Html
import android.widget.TextView
import android.widget.ToggleButton

class StevenActivity : AppCompatActivity() {
    private lateinit var togglebtn: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_steven)
        togglebtn = findViewById(R.id.toggle11)
        togglebtn.setOnClickListener { toggleState() }

        val txt1 = findViewById<TextView>(R.id.steven1)
        val newText1 = "<font color=#01e8ea>FULL NAME:</font><br/> <font color=#ffffff>Steven Quartz Universe</font>"
        txt1.text = Html.fromHtml(newText1)
        val txt2 = findViewById<TextView>(R.id.steven2)
        val newText2 = "<font color=#01e8ea>FIRST APPEARANCE:</font><br/> <font color=#ffffff>Steven Universe - \"Pilot\"</font><br/><font color=#ffffff>(May 2013)</font>"
        txt2.text = Html.fromHtml(newText2)
        val txt3 = findViewById<TextView>(R.id.steven3)
        val newText3 = "<font color=#01e8ea>SPECIAL MOVES:</font><br/> <font color=#ffffff>Bubble Boy!</font><br/><font color=#ffffff>Shield Stepper</font>"
        txt3.text = Html.fromHtml(newText3)
    }

    override fun onResume() {
        super.onResume()
        val penyimpanan: SharedPreferences = getSharedPreferences("simpan", AppCompatActivity.MODE_PRIVATE)
        togglebtn.isChecked = penyimpanan.getBoolean("steven",false)
    }

    private fun toggleState() {
        val penyimpanan: SharedPreferences = getSharedPreferences("simpan", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = penyimpanan.edit()
        editor.putBoolean("steven", togglebtn.isChecked)
        editor.apply()
    }
}