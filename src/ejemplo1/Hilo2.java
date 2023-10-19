package ejemplo1;

public class Hilo2 implements Runnable{
    public void run() {
        System.out.println("Thread is Running Successfully");
    }

    public static void main(String[] args) {
        Hilo2 g1 = new Hilo2();
        // initializing Thread Object
        Thread t1 = new Thread(g1);
        t1.start();
    }
}
