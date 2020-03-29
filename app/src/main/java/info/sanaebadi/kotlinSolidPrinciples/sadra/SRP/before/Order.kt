package info.sanaebadi.kotlinSolidPrinciples.sadra.SRP.before

import android.annotation.SuppressLint
import android.os.Message
import android.se.omapi.Session
import android.service.textservice.SpellCheckerService
import android.util.Log
import android.webkit.MimeTypeMap
import java.lang.Exception
import java.util.*
import java.util.logging.Logger

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


    @SuppressLint("LongLogTag")
    fun notifyCustomer(cart:Cart){
        val customerEmail:String=cart.getCustomerEmail()

        if (!customerEmail.isEmpty()){
            val properties:Properties=System.getProperties()
            properties.setProperty("mail.smtp.host" ,"localhost")
            val session= Session.getDefaultInstance(properties)
            val message:Message=MimeTypeMap(session)

            try {


            }catch (ex:Exception){
                Log.e("Problem sending notification email" , ex.toString())
            }
        }
    }

}