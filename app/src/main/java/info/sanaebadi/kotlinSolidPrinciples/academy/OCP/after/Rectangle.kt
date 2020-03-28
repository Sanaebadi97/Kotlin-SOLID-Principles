package info.sanaebadi.kotlinSolidPrinciples.academy.OCP.after

data class Rectangle(val length: Double, val height: Double) :Shape {


    override fun getArea(): Double {
       return (length * height)
    }
}