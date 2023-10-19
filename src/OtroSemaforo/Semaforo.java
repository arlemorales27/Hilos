package OtroSemaforo;

import java.util.concurrent.Semaphore;

public class Semaforo {
    public static void main(String[] args) {

        Semaphore rojo = new Semaphore(1);
        Semaphore ambar = new Semaphore(0);
        Semaphore verde = new Semaphore(0);

        Thread hiloRojo = new Thread(new LuzRoja(rojo, ambar));
        Thread hiloAmbar = new Thread(new LuzAmbar(ambar, verde));
        Thread hiloVerde = new Thread(new LuzVerde(verde, rojo));

        hiloRojo.start();
        hiloAmbar.start();
        hiloVerde.start();

    }

}
