package Part_I;

// A nested interface example.
// This class contains a member interface.
class A3 {
    // this is a nested interface
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}
// B implements the nested interface.
class B3 implements A3.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false: true;
    }
}
public class Nested_Interface_Demo {
    public static void main(String args[]) {
        // use a nested interface reference
        A3.NestedIF nif = new B3();
        if(nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if(nif.isNotNegative(-12))
            System.out.println("this won't be displayed");
    }
}
