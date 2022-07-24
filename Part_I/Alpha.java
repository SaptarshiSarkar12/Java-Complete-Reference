package Part_I;

public interface Alpha extends Beta {
    default void reset(){
        System.out.println("Alpha's reset() method");
        System.out.println("Referring to Beta's reset() method below...");
        Beta.super.reset(); // can also refer to the default implementation of 'Beta'
    }
}
