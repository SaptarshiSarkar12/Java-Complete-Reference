package Part_I;
// Demonstrate exception chaining.

public class ChainExcDemo {
    static void demoproc() {
        // create an exception
        NullPointerException e = new NullPointerException("top layer");
        // add a cause
        ArithmeticException ae = new ArithmeticException("cause");
        e.initCause(ae);
        IllegalArgumentException iae = new IllegalArgumentException("Illegal Argument");
        ae.initCause(iae);
        throw e;
    }

    static void demoproc2() {
        // create an exception
        ArithmeticException ae = new ArithmeticException("cause");
        // add a cause
        IllegalArgumentException iae = new IllegalArgumentException("Illegal Argument");
        ae.initCause(iae);
        throw ae;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            // display top level exception
            System.out.println("Caught: " + e);
            // display cause exception
            System.out.println("Original cause: " +
                    e.getCause());
        }

        try {
            demoproc();
        } catch (NullPointerException | ArithmeticException e){ // multi-catch feature demo
            // display top level exception
            System.out.println("Caught: " + e);
            // display cause exception
            System.out.println("Original cause: " +
                    e.getCause());
        }
    }
}
