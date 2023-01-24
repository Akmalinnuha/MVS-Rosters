package com.akmalinnuha.aplikasisubmisi

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.Html
import android.widget.TextView
import android.widget.ToggleButton

class BugsBunnyActivity : AppCompatActivity() {
    private lateinit var togglebtn: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bugs_bunny)
        togglebtn = findViewById(R.id.toggle3)
        togglebtn.setOnClickListener { toggleState() }

        val txt1 = findViewById<TextView>(R.id.bugsbunny1)
        val newText1 = "<font color=#01e8ea>FIRST APPEARANCE:</font><br/> <font color=#ffffff>\"Wild Hare\"</font><br/><font color=#ffffff>(July 1940)</font>"
        txt1.text = Html.fromHtml(newText1)
        val txt2 = findViewById<TextView>(R.id.bugsbunny2)
        val newText2 = "<font color=#01e8ea>CREATOR:</font><br/> <font color=#ffffff>Tex Avery</font>"
        txt2.text = Html.fromHtml(newText2)
        val txt3 = findViewById<TextView>(R.id.bugsbunny3)
        val newText3 = "<font color=#01e8ea>SPECIAL MOVES:</font><br/> <font color=#ffffff>A Safe Investment</font><br/><font color=#ffffff>Special Delive-Rocket</font>"
        txt3.text = Html.fromHtml(newText3)
    }
    override fun onResume() {
        super.onResume()
        val penyimpanan: SharedPreferences = getSharedPreferences("simpan", AppCompatActivity.MODE_PRIVATE)
        togglebtn.isChecked = penyimpanan.getBoolean("bBunny",false)
    }

    private fun toggleState() {
        val penyimpanan: SharedPreferences = getSharedPreferences("simpan", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = penyimpanan.edit()
        editor.putBoolean("bBunny", togglebtn.isChecked)
        editor.apply()
    }
}