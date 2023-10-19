package ejemplo1;

public class Hilo4 implements Runnable{
    public void run() {
        System.out.println("Thread is created and running successfully...");
    }
    public static void main(String[] args) {
        // Runnable interface
        Runnable r1 = new Hilo4();
        Thread t1 = new Thread(r1, "Mi hilo");
        // Thread object started
        t1.start();
        // getting the Thread with String Method
        System.out.println(t1.getName());
    }
}
