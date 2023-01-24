package com.akmalinnuha.aplikasisubmisi

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.Html
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity


class AryaStarkActivity : AppCompatActivity() {
    private lateinit var togglebtn: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arya_stark)
        togglebtn = findViewById(R.id.toggle1)
        togglebtn.setOnClickListener { toggleState() }

        val txt1 = findViewById<TextView>(R.id.arya1)
        val newText1 = "<font color=#01e8ea>PLACE OF BIRTH:</font><br/> <font color=#ffffff>Winterfell</font>"
        txt1.text = Html.fromHtml(newText1)
        val txt2 = findViewById<TextView>(R.id.arya2)
        val newText2 = "<font color=#01e8ea>FIRST APPEARANCE:</font><br/> <font color=#ffffff>Game of Thrones</font><br/><font color=#ffffff>\"Winter is Coming\"(2011)</font>"
        txt2.text = Html.fromHtml(newText2)
        val txt3 = findViewById<TextView>(R.id.arya3)
        val newText3 = "<font color=#01e8ea>SPECIAL MOVES:</font><br/> <font color=#ffffff>Face-Stealer</font><br/><font color=#ffffff>Dagger Slash</font>"
        txt3.text = Html.fromHtml(newText3)
    }

    override fun onResume() {
        super.onResume()
        val penyimpanan: SharedPreferences = getSharedPreferences("simpan", AppCompatActivity.MODE_PRIVATE)
        togglebtn.isChecked = penyimpanan.getBoolean("arya",false)
    }

    private fun toggleState() {
        val penyimpanan: SharedPreferences = getSharedPreferences("simpan", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = penyimpanan.edit()
        editor.putBoolean("arya", togglebtn.isChecked)
        editor.apply()
    }
}