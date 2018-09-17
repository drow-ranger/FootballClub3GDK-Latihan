package com.deonico.footballclub3gdk_latihan.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.deonico.footballclub3gdk_latihan.R
import com.deonico.footballclub3gdk_latihan.R.id.favorites
import com.deonico.footballclub3gdk_latihan.R.id.teams
import com.deonico.footballclub3gdk_latihan.R.layout.activity_home
import com.deonico.footballclub3gdk_latihan.favorites.FavoriteTeamsFragment
import com.deonico.footballclub3gdk_latihan.teams.TeamsFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_home)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                teams -> {
                    loadTeamsFragment(savedInstanceState)
                }
                favorites -> {
                    loadFavoritesFragment(savedInstanceState)
                }
            }
            true
        }
        bottom_navigation.selectedItemId = teams
    }


    private fun loadTeamsFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_container, TeamsFragment(), TeamsFragment::class.java.simpleName)
                    .commit()
        }
    }

    private fun loadFavoritesFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_container, FavoriteTeamsFragment(), FavoriteTeamsFragment::class.java.simpleName)
                    .commit()
        }
    }
}
