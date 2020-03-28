package info.sanaebadi.kotlinSolidPrinciples.academy.ISP.before

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import info.sanaebadi.kotlinSolidPrinciples.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val create: Button = findViewById(R.id.create)

        create.setOnClickListener{
            // assume this is a todo based app.
            myDatabase.createTask(...)

            fun onLongClick(v: View?){

                // do nothing, we're not long clicking
            }

            fun onTouch(v: View?, event: MotionEvent?){
                // do nothing, we're not worried about touch
            }
        }
    }
}
