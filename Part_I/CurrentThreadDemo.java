package Part_I;

// Controlling the main Thread.
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread : " + t);
        t.setName("Saptarshi's Thread");
        System.out.println("After name change: " + t);

        try {
            for (int n = 0; n < 5 ; n++){
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
    }
}
