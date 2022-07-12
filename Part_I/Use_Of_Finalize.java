package Part_I;

public class Use_Of_Finalize {
    public static void main(String[] args) {
        Use_Of_Finalize use_of_finalize = new Use_Of_Finalize();
    }

    protected void finalize(){
        // actions to do before object is removed from the memory.
        // Overrides 'finalize' method in 'Object.java'
    }
}
