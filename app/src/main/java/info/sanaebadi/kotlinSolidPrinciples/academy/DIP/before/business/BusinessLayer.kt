package info.sanaebadi.kotlinSolidPrinciples.academy.DIP.before.business

// in the business layer, return an ID of the expense
fun saveExpense(expense: Expense?): Int {
    // ... some code to check for validity ... then save
    // ... do some other logic, like check for duplicates/etc
    val dl = DataLayer()
    return dl.insert(expense)


    /**
     * The problem with the above code is that it breaks the Dependency Inversion Principle -
     * namely item (a) from above: High-level modules should not depend on low-level modules.
     * Both should depend on abstractions. The UI is depending upon a concrete instance of the business layer with this line:

    BusinessLayer bl = new BusinessLayer();
     *
     */
}