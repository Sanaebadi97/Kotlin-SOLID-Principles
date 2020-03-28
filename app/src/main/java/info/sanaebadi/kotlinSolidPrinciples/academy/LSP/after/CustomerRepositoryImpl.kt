package info.sanaebadi.kotlinSolidPrinciples.academy.LSP.after

import info.sanaebadi.kotlinSolidPrinciples.academy.LSP.before.Customer


interface CustomerRepository {
    fun getCustomersWithIds(ids: List<Int?>?): List<Customer?>?
}

class CustomerRepositoryImpl : CustomerRepository {


    override fun getCustomersWithIds(ids: List<Int?>?): List<Customer?>? {

        // Go to API, DB, etc and get the customers.
        // Go to API, DB, etc and get the customers.
        return api.getWholeLottaCustomers(ids)
    }
}

// Somewhere else in the program
val  customers:List<Customer> = customerRepository.getCustomersWithIds(...)