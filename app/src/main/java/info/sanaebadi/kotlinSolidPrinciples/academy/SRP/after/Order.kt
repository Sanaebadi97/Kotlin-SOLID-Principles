package info.sanaebadi.kotlinSolidPrinciples.academy.SRP.after

import info.sanaebadi.kotlinSolidPrinciples.academy.SRP.after.LineItem

data class Order(val orderNumber: Int = 0, val totalNumber: Int = 0, val lineItems: List<LineItem>)
