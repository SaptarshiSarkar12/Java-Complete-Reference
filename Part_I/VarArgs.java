package Part_I;

// Use varargs with standard arguments.
class VarArgs {
    // Here, msg is a normal parameter and v is a varargs parameter.
    static void vaTest(String msg, int ...v) { // here, 'v' is an array of type int
        System.out.print(msg + v.length +
                " Contents: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}
