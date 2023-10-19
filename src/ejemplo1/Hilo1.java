package ejemplo1;

public class Hilo1 extends Thread {
    public void run() {
        System.out.println("Thread Started Running...");
    }
    public static void main(String[] args) {
        Hilo1 g1 = new Hilo1();
        // Invoking Thread using start() method
        g1.start();
    }
}