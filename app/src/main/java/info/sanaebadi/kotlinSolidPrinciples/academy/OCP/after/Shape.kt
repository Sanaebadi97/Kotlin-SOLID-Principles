package info.sanaebadi.kotlinSolidPrinciples.academy.OCP.after

/*

Hmmm, but that makes the AreaManager still have to know about
 all the shapes, right? Because how does it know that the object
 it’s iterating over has an area method?
 Sure, this could be solved with reflection (cough gross cough)
  or we could have each of the shape classes inherit from an interface:
   the Shape interface (this could also be an abstract class too):

 */

interface Shape {
    fun getArea(): Double
}