package info.sanaebadi.kotlinSolidPrinciples.academy.SRP.OCP

class AreaManager {
    fun calculateArea(vararg shapes: ArrayList<Rectangle?>): Double {
        var area = 0.0
        for ((length, height) in shapes) {
            area += length * height
        }
        return area
    }

}