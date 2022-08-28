package Part_I;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple1 ap;
        // Display price of Winesap.
        System.out.println("Winesap costs " + Apple1.Winesap.getPrice() + " cents.\n");
        // Display all apples and prices.
        System.out.println("All apple prices:");
        for(Apple1 a : Apple1.values()) {
            System.out.println(a + " costs " + a.getPrice() + " cents.");
        }
    }
}
