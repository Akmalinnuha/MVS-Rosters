package com.akmalinnuha.aplikasisubmisi

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var mvsRosters: RecyclerView
    private var list: ArrayList<Roster> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mvsRosters = findViewById(R.id.multiversus_rosters)
        mvsRosters.setHasFixedSize(true)

        list.addAll(RostersData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun showRecyclerList() {
        mvsRosters.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListRosterAdapter(list)
        mvsRosters.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListRosterAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Roster) {
                showSelectedHero(data)
            }
        })
    }

    private fun showSelectedHero(roster: Roster?) {
        when(roster?.name) {
            "Arya Stark" -> {
                val ganti = Intent(this@MainActivity,AryaStarkActivity::class.java)
                startActivity(ganti)
            }
            "Batman" -> {
                val ganti = Intent(this@MainActivity,BatmanActivity::class.java)
                startActivity(ganti)
            }
            "Bugs Bunny" -> {
                val ganti = Intent(this@MainActivity,BugsBunnyActivity::class.java)
                startActivity(ganti)
            }
            "Finn" -> {
                val ganti = Intent(this@MainActivity,FinnActivity::class.java)
                startActivity(ganti)
            }
            "Garnet" -> {
                val ganti = Intent(this@MainActivity,GarnetActivity::class.java)
                startActivity(ganti)
            }
            "Harley Quinn" -> {
                val ganti = Intent(this@MainActivity, HarleyQuinnActivity::class.java)
                startActivity(ganti)
            }
            "Jake The Dog" -> {
                val ganti = Intent(this@MainActivity, JakeActivity::class.java)
                startActivity(ganti)
            }
            "Reindog" -> {
                val ganti = Intent(this@MainActivity, ReindogActivity::class.java)
                startActivity(ganti)
            }
            "Shaggy" -> {
                val ganti = Intent(this@MainActivity, ShaggyActivity::class.java)
                startActivity(ganti)
            }
            "Steven Universe" -> {
                val ganti = Intent(this@MainActivity, StevenActivity::class.java)
                startActivity(ganti)
            }
            "Superman" -> {
                val ganti = Intent(this@MainActivity, SupermanActivity::class.java)
                startActivity(ganti)
            }
            "Taz" -> {
                val ganti = Intent(this@MainActivity,TazActivity::class.java)
                startActivity(ganti)
            }
            "Tom and Jerry" -> {
                val ganti = Intent(this@MainActivity,TomJerryActivity::class.java)
                startActivity(ganti)
            }
            "Velma" -> {
                val ganti = Intent(this@MainActivity,VelmaActivity::class.java)
                startActivity(ganti)
            }
            "Wonder Woman" -> {
                val ganti = Intent(this@MainActivity, WonderWomanActivity::class.java)
                startActivity(ganti)
            }
        }
    }

    fun toprofile(item: MenuItem) {
        val moveIntent = Intent(this@MainActivity, ProfilePage::class.java)
        startActivity(moveIntent)
    }

}
