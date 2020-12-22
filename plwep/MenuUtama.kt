package com.example.plwep

import android.app.SearchManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MenuUtama : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawer : DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)

        drawer = findViewById(R.id.drawer_layout)
        val navigationview : NavigationView = findViewById(R.id.nav_view)
        navigationview.setNavigationItemSelectedListener(this)

        val toolbar : androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val toggle : ActionBarDrawerToggle =  ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        // Drawer Awal yang kebuka
        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, BerandaFragment()).commit()
            navigationview.setCheckedItem(R.id.nav_beranda)
        }
    }
       // Menu Drawer
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_beranda -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, BerandaFragment()).commit()
            }
            R.id.nav_matkul -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, MatkulFragment()).commit()
            }
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
        // Ketika di back gak langsung close aplikasinya
    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        }
        else {
            super.onBackPressed()
        }
    }
}
