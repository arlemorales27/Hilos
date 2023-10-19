package ejemplo2;

public class MiHilo extends Thread {
    public void run() {
        // Código para imprimir números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Código para imprimir un mensaje
        System.out.println("Hilo ejecutándose");

    }

}