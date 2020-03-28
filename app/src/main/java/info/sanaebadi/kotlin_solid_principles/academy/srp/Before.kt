package info.sanaebadi.kotlin_solid_principles.academy.srp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import info.sanaebadi.kotlin_solid_principles.R


class LineItem() {
    private val description: String? = null
    private val quantity = 0
    private val price: Long = 0
    // ... getters/setters
}

class Order {
    private val orderNumber = 0
    private val lineItems: List<LineItem> =
        ArrayList() // ... getters/setters
}


class OrderRecyclerAdapter(var items: List<Order>, var itemLayout: Int) :
    RecyclerView.Adapter<OrderRecyclerAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(itemLayout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // TODO: bind the view here
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var orderNumber: AppCompatTextView? = null
        var orderTotal: AppCompatTextView? = null


        init {

            orderNumber = itemView.findViewById(R.id.order_number)
            orderTotal = itemView.findViewById(R.id.order_total)
        }
    }

}