package Part_I;

public class EnumDemo2 {
    public static void main(String args[])
    {
        Apple ap;
        System.out.println("Here are all Apple constants:");
        // use values()
        Apple allapples[] = Apple.values();
        for(Apple a : allapples) {
            System.out.println(a);
        }
        System.out.println();
        // use valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
