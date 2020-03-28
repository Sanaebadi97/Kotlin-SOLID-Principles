package info.sanaebadi.kotlin_solid_principles.academy.SRP

data class Order(val orderNumber: Int = 0, val totalNumber: Int = 0, val lineItems: List<LineItem>)
