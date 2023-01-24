package com.akmalinnuha.aplikasisubmisi

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.Html
import android.widget.TextView
import android.widget.ToggleButton

class ReindogActivity : AppCompatActivity() {
    private lateinit var togglebtn: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reindog)
        togglebtn = findViewById(R.id.toggle9)
        togglebtn.setOnClickListener { toggleState() }

        val txt1 = findViewById<TextView>(R.id.reindog1)
        val newText1 = "<font color=#01e8ea>ACTUAL NAME:</font><br/> <font color=#ffffff>Unpronounceable</font>"
        txt1.text = Html.fromHtml(newText1)
        val text2 = findViewById<TextView>(R.id.reindog2)
        val newText2 = "<font color=#01e8ea>AGE:</font><br/> <font color=#ffffff>165 years old</font>"
        text2.text = Html.fromHtml(newText2)
        val txt3 = findViewById<TextView>(R.id.reindog3)
        val newText3 = "<font color=#01e8ea>FIRST APPEARANCE:</font><br/> <font color=#ffffff>Multiversus</font><br/><font color=#ffffff>(2022)</font>"
        txt3.text = Html.fromHtml(newText3)
        val txt4 = findViewById<TextView>(R.id.reindog4)
        val newText4 = "<font color=#01e8ea>SPECIAL MOVES:</font><br/> <font color=#ffffff>Love Leash, Dude!</font><br/><font color=#ffffff>Power Crystal</font>"
        txt4.text = Html.fromHtml(newText4)
    }

    override fun onResume() {
        super.onResume()
        val penyimpanan: SharedPreferences = getSharedPreferences("simpan", AppCompatActivity.MODE_PRIVATE)
        togglebtn.isChecked = penyimpanan.getBoolean("reindog",false)
    }

    private fun toggleState() {
        val penyimpanan: SharedPreferences = getSharedPreferences("simpan", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = penyimpanan.edit()
        editor.putBoolean("reindog", togglebtn.isChecked)
        editor.apply()
    }
}