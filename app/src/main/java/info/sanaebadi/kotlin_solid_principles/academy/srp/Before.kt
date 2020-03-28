package info.sanaebadi.kotlin_solid_principles.academy.srp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import info.sanaebadi.kotlin_solid_principles.R
import java.text.NumberFormat
import java.util.*


data class LineItem(val description: String? = null, val quantity: Int = 0, val price: Long = 0)

data class Order(val orderNumber: Int = 0, val lineItems: List<LineItem>)


class OrderRecyclerAdapter(var items: List<Order>, var itemLayout: Int) :
    RecyclerView.Adapter<OrderRecyclerAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(itemLayout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val order = items[position]
        holder.orderNumber!!.text = (order.orderNumber.toString())
        var total: Long = 0
        for ((_, _, price) in order.lineItems) {
            total += price
        }

        val formatter: NumberFormat = NumberFormat.getCurrencyInstance(Locale.US)
        val totalValue: String =
            formatter.format(2000 / 100.0) // Must divide by a double otherwise we'll lose precision
        holder.orderTotal!!.text = totalValue
        holder.itemView.tag = order


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