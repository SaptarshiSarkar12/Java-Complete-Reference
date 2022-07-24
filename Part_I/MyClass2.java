package Part_I;

public class MyClass2 implements Alpha, Beta {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        obj.reset();
    }

    public void reset() { // this overriden default method would run when two non-inheriting interfaces containing same default methods would be implemented
        System.out.println("MyClass2's reset method");
    }
}
