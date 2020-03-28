package info.sanaebadi.kotlinSolidPrinciples.academy.OCP.after


//we added this in next week so we should change the AreaManager class :( OPS...

data class Circle(val radius: Double) : Shape {


    override fun getArea(): Double {
       return (radius * radius * Math.PI)
    }
}