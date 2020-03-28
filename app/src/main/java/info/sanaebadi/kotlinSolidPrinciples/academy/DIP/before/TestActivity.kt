package info.sanaebadi.kotlinSolidPrinciples.academy.DIP.before

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import info.sanaebadi.kotlinSolidPrinciples.R

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<View>(R.id.save_expense).setOnClickListener(object :
            View.OnClickListener {
            override fun onClick(v: View) {
                val expense: ExpenseModel =  //... create the model from the view values
                    BusinessLayer
                bl = BusinessLayer()
                if (bl.isValid(expense)) {
                    // Woo hoo! Save it and Continue to next screen/etc
                } else {
                    Toast.makeText(
                        this,
                        "Shucks, couldnt save expense. Erorr: " + bl.getValidationErrorFor(expense),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        })
    }
}