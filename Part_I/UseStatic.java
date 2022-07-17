package Part_I;

// Demonstrate static variables, methods, and blocks.
public class UseStatic {
    static int a = 3;
    static int b;
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static { // this method is called first when the class is loaded, then the main method is called !
        System.out.println("Static block initialized.");
        b = a * 4;
    }
    public static void main(String args[]) {
        System.out.println("main method called");
        meth(42);
    }
}
