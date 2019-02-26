package com.pratamawijaya.uicollections

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.pratamawijaya.uicollections.bottomsheet.BottomSheetActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBottomSheet.setOnClickListener {
            startActivity(Intent(this, BottomSheetActivity::class.java))
        }
    }
}
