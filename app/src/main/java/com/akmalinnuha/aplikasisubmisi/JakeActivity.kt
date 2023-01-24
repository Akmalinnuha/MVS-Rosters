package com.akmalinnuha.aplikasisubmisi

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.Html
import android.widget.TextView
import android.widget.ToggleButton

class JakeActivity : AppCompatActivity() {
    private lateinit var togglebtn: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jake)
        togglebtn = findViewById(R.id.toggle8)
        togglebtn.setOnClickListener { toggleState() }

        val txt1 = findViewById<TextView>(R.id.jake1)
        val newText1 = "<font color=#01e8ea>MARITAL STATUS:</font><br/> <font color=#ffffff>Married to Lady Rainicorn</font>"
        txt1.text = Html.fromHtml(newText1)
        val txt2 = findViewById<TextView>(R.id.jake2)
        val newText2 = "<font color=#01e8ea>FIRST APPEARANCE:</font><br/> <font color=#ffffff>\"Adventure Time\"</font><br/><font color=#ffffff>(January 2007)</font>"
        txt2.text = Html.fromHtml(newText2)
        val txt3 = findViewById<TextView>(R.id.jake3)
        val newText3 = "<font color=#01e8ea>SPECIAL MOVES:</font><br/> <font color=#ffffff>Rubber Stomach</font><br/><font color=#ffffff>Dude!, Strechin' Out</font>"
        txt3.text = Html.fromHtml(newText3)
    }

    override fun onResume() {
        super.onResume()
        val penyimpanan: SharedPreferences = getSharedPreferences("simpan", AppCompatActivity.MODE_PRIVATE)
        togglebtn.isChecked = penyimpanan.getBoolean("jake",false)
    }

    private fun toggleState() {
        val penyimpanan: SharedPreferences = getSharedPreferences("simpan", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = penyimpanan.edit()
        editor.putBoolean("jake", togglebtn.isChecked)
        editor.apply()
    }
}