package info.sanaebadi.kotlinSolidPrinciples.academy.OCP.after


/**
 *
 * We’ve made changes to the AreaManager that allow it to be closed for modification but open for extension. If we need to add a new shape
 * , such as an octagon, the AreaManager will not need to be changed because it is open for extension through the Shape interface
 */

class AreaManager {

    fun calculateArea(vararg shapes: ArrayList<Any?>?): Double {
        var area = 0.0

        for (shape: Shape in shapes) {
            area += shape.getArea()
        }

        return area
    }
}