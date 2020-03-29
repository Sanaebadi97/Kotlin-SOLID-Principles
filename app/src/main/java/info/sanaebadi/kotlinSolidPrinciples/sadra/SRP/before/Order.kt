package info.sanaebadi.kotlinSolidPrinciples.sadra.SRP.before

class Order {

    fun checkOut(
        cart: Cart,
        paymentDetails: PaymentDetails,
        notifyCustomer: Boolean
    ) {

        if (paymentDetails.getPaymentMethod() == CreditCard) {

            chargeCard(paymentDetails, cart)
        }

        ReserveInventory(cart)

        if (notifyCustomer) {
            NotifyCustomer(cart)
        }

    }
}