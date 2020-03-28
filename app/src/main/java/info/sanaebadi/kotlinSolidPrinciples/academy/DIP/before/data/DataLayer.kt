package info.sanaebadi.kotlinSolidPrinciples.academy.DIP.before.data

import info.sanaebadi.kotlinSolidPrinciples.academy.DIP.before.IDataLayer


class DataLayer : IDataLayer {

    override fun insert(expense:Expense){

    }

    override fun insert(expense: Any) {
        TODO("Not yet implemented")
    }

    override fun find(id:Int):Expense{

    }

    override fun findAll():List<Expense>{

    }
}