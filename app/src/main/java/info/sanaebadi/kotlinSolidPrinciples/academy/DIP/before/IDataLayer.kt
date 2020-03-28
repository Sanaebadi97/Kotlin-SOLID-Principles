package info.sanaebadi.kotlinSolidPrinciples.academy.DIP.before

interface IDataLayer {
    fun insert(expense: Any)
    fun find(id: Int): Any
    fun findAll(): List<Any>
}