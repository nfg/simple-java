/*******************************************************************************
 * Yarr
 * ----
 *
 *  Simple testing class. The goal is to show that the main class can import
 *  this class, and then magic will happen.
 *
 *  YES I BELIEVE IN FAERIES.
 ******************************************************************************/

public class Yarr {
    private String status;

    // Default constructor
    Yarr() {
        this.status = "Default status";
    }

    // Constructor with one arg
    Yarr(String new_status) {
        this.status = new_status;
        // You could also do "status = new_status". I guess that inside class
        // scope, the "this" keyword isn't actually required. But I'd use it
        // anyway for readability.
    }

    public String getStatus() {
        return this.status;
    }
}

