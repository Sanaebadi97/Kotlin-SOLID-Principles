package info.sanaebadi.kotlinSolidPrinciples.academy.DIP.before

/*
 * Class called Emailer to send email alerts
 */
class Emailer {
    fun generateJobAlert(job: String): String {
        return "You are alerted for $job"
    }
} /*
 * Class called Phone to send phone alerts
 */

class Phone {
    fun generateJobAlert(job: String): String {
        return "You are alerted for $job"
    }
} /*
 * Class called JobTracker.
 * This class initializes both the Phone & Email class
 * This is a violation of the DIP principle
 */

class JobTracker {
    private val phone: Phone
    private val emailer: Emailer

    /*
     * Based on the jobDescription, the alert is sent
     * This logic should not be implemented here!
     */
    fun setCurrentConditions(jobDescription: String) {
        if (jobDescription === "urgent") {
            val alert = phone.generateJobAlert(jobDescription)
            print(alert)
        }
        if (jobDescription === "brief") {
            val alert = emailer.generateJobAlert(jobDescription)
            print(alert)
        }
    }

    init {
        phone = Phone()
        emailer = Emailer()
    }
}