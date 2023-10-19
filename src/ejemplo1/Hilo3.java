package ejemplo1;

public class Hilo3 {
    public static void main(String args[]) {
        // Thread object created
        // and initiated with data
        Thread t = new Thread("hilo saludo");
        // Thread gets started
        t.start();
        // getting data of
        // Thread through String
        System.out.println(t.getName());
    }
}
