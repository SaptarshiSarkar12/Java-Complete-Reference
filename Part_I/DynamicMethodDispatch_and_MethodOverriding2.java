package Part_I;

// Using abstract methods and classes.
abstract class Figure2 {
    double dim1;
    double dim2;
    Figure2(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    // area is now an abstract method
    abstract double area();
}
class Rectangle2 extends Figure2 {
    Rectangle2(double a, double b) {
        super(a, b);
    }
    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
class Triangle2 extends Figure2 {
    Triangle2(double a, double b) {
        super(a, b);
    }
    // override area for right triangle
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

public class DynamicMethodDispatch_and_MethodOverriding2 {
    public static void main(String args[]) {
        // Figure f = new Figure(10, 10); // illegal now
        Rectangle2 r = new Rectangle2(9, 5);
        Triangle2 t = new Triangle2(10, 8);
        Figure2 figref; // this is OK, no object is created
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
    }
}
