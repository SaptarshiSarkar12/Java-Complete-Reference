package Part_I;

public interface Beta {
    default void reset(){
        System.out.println("Beta's reset() method");
    }
}
