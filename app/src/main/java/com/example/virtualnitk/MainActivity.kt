package com.example.virtualnitk

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.widget.Toolbar as Toolbar1

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var toolbar: Toolbar1
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var navigationview: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById(R.id.toolbar) as Toolbar1
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_layout)
        navigationview = findViewById(R.id.nav_view)
        navigationview.setNavigationItemSelectedListener(this)

        val toggle: ActionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            drawer,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer.addDrawerListener(toggle)
        toggle.syncState()

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container, NewsFragment.newInstance()
            ).commit()
            navigationview.setCheckedItem(R.id.nav_news)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_news -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.fragment_container, NewsFragment.newInstance()
                ).commit()
            }
            R.id.nav_events -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.fragment_container, EventsFragment.newInstance()
                ).commit()
            }
            R.id.nav_mess_menu -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.fragment_container, MessMenuFragment.newInstance()
                ).commit()
            }
            R.id.nav_map -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.fragment_container, MapFragment.newInstance()
                ).commit()
            }
            R.id.nav_working_hrs -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.fragment_container, WorkingHrsFragment.newInstance()
                ).commit()
            }
            R.id.nav_share -> {
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_rate -> {
                Toast.makeText(this, "Rate Us", Toast.LENGTH_SHORT).show()
            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}