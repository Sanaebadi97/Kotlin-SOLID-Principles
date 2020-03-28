package info.sanaebadi.kotlinSolidPrinciples.academy.ISP.before

import android.view.MotionEvent
import android.view.View


interface OnClickListener {
    fun onClick(v: View?)
    fun onLongClick(v: View?)
    fun onTouch(v: View?, event: MotionEvent?)
}