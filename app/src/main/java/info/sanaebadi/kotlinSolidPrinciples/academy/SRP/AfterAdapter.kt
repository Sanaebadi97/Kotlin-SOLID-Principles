package info.sanaebadi.kotlinSolidPrinciples.academy.SRP

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import info.sanaebadi.kotlinSolidPrinciples.R


class AfterAdapter(var items: List<Order>, var itemLayout: Int) :
    RecyclerView.Adapter<AfterAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(itemLayout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val order = items[position]
        holder.orderNumber!!.text = (order.orderNumber.toString())
        holder.orderTotal!!.text = order.totalNumber.toString() // Move the calculation and formatting elsewhere
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