package info.sanaebadi.kotlinSolidPrinciples.academy.DIP.after

/*
 * Solution step 1: Create an interface called Notifier.
 * It has one method: jobAlert(String jobDescription);
 */
interface Notifier {
    fun jobAlert(jobDescription: String?)
} /*
 * Step II:
 * Create an emailClient class that implements
 * Notifier interface
 */

class EmailClient : Notifier {
    override fun jobAlert(jobDescription: String?) {
        if (jobDescription === "brief");
        print("Job description is brief")
    }
} /*
 * Step III:
 * Create an PhoneClient class that implements
 * Notifier interface
 */

class PhoneClient : Notifier {
    override fun jobAlert(jobDescription: String?) {
        if (jobDescription === "urgent");
        print("Job description is urgent")
    }
} /*
 * Step IV: The JobTracker class would just
 * call the respective notifiers. It does not
 * handle any logic
 */

class JobTracker {
    private var currentAlert: String? = null
    fun setCurrentConditions(jobDescription: String?) {
        currentAlert = jobDescription
    }

    fun notify(notifier: Notifier) {
        notifier.jobAlert(currentAlert)
    }
}