package OtroSemaforo;

import java.util.concurrent.Semaphore;

public class LuzVerde implements Runnable {

        Semaphore miSemaforo;
        Semaphore siguienteSemaforo;

        LuzVerde(Semaphore miSemaforo, Semaphore siguienteSemaforo) {
            this.miSemaforo = miSemaforo;
            this.siguienteSemaforo = siguienteSemaforo;
        }

        public void run() {
            try {
                miSemaforo.acquire();
                System.out.println("Luz verde encendida");
                Thread.sleep(3000);
                siguienteSemaforo.release();
            } catch (InterruptedException e) {}
        }

    }

