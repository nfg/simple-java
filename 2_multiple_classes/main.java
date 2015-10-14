/******************************************************************************
 * main
 * ----
 *  To run
 *      $ javac main.java
 *      $ java main
 *
 *  That should take care of any required compilation. Magic will happen.
 *
 *  NOTE: Even though "Yarr" is not explicitly imported, Java is smart enough
 *  to look inside the current directory for the class.
 ******************************************************************************/

public class main {
    public static void main(String[] args) {

        System.out.println("Testing default constructor...");
        Yarr test_obj = new Yarr();
        // For slightly nicer output, I'm using string concatenation to add
        // quotation marks around the output.
        System.out.println('"' + test_obj.getStatus() + '"');

        System.out.println("Testing constructor what accepts one string...");
        test_obj = new Yarr("This string was passed to the constructor.");
        System.out.println('"' + test_obj.getStatus() + '"');

        // Uncommenting the below string will stop this from even compiling.
        // Java is smart enough to check for a constructor that accepts an Int,
        // and in this case it does not exist.

        // test_obj = new Yarr(1234);

    }
}

