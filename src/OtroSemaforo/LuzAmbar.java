package OtroSemaforo;

import java.util.concurrent.Semaphore;

public class LuzAmbar implements Runnable {

        Semaphore miSemaforo;
        Semaphore siguienteSemaforo;

        LuzAmbar(Semaphore miSemaforo, Semaphore siguienteSemaforo) {
            this.miSemaforo = miSemaforo;
            this.siguienteSemaforo = siguienteSemaforo;
        }

        public void run() {
            try {
                miSemaforo.acquire();
                System.out.println("Luz ambar encendida");
                Thread.sleep(3000);
                siguienteSemaforo.release();
            } catch (InterruptedException e) {}
        }

    }
