package Part_I;

public class MyIFImp2 implements MyIF {
    // Here, implementations for both getNumber( ) and getString( ) are provided.
    public int getNumber() {
        return 100;
    }
    public String getString() {
        return "This is a different string.";
    }

    public static void main(String[] args) {
        int defNum = MyIF.getDefaultNumber();
        System.out.println(defNum);
    }
}
