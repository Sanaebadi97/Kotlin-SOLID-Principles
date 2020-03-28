package info.sanaebadi.kotlinSolidPrinciples.academy.SRP

data class Order(val orderNumber: Int = 0, val totalNumber: Int = 0, val lineItems: List<LineItem>)
