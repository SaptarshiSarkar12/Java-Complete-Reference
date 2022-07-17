package Part_I;

public class NestedClasses {
    int outer_x = 100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    // this is an inner class
    class Inner { // Generally non-static nested classes are defined.
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
class InnerClassDemo {
    public static void main(String args[]) {
        NestedClasses outer = new NestedClasses();
        outer.test();
    }
}
