package com.pratamawijaya.uicollections.bottomsheet

import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.v7.app.AppCompatActivity
import com.pratamawijaya.uicollections.R
import kotlinx.android.synthetic.main.bottom_sheet.*

class BottomSheetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)

        val bottomSheet = BottomSheetBehavior.from(bottomSheet)

        containerDetail.setOnClickListener {
            if (bottomSheet.state != BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheet.state = BottomSheetBehavior.STATE_EXPANDED
            } else {
                bottomSheet.state = BottomSheetBehavior.STATE_COLLAPSED
            }
        }
    }
}
