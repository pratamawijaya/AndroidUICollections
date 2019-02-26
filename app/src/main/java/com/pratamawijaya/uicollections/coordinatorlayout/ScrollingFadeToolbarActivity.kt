package com.pratamawijaya.uicollections.coordinatorlayout

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.pratamawijaya.uicollections.R
import kotlinx.android.synthetic.main.activity_scrolling_fade_toolbar.*

class ScrollingFadeToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling_fade_toolbar)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        collapsingToolbar.title = "Title Collapsingtoolbar"
        collapsingToolbar.setExpandedTitleColor(ContextCompat.getColor(this, android.R.color.transparent))


    }
}
