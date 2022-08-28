package Part_I;

public enum Apple2 {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
    private int price; // price of each apple
    // Constructor
    Apple2(int p) { price = p; }
    // Overloaded constructor
    Apple2() { price = -1; }
    int getPrice() { return price; }
}
