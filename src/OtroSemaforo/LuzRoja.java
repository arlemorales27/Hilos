package OtroSemaforo;

import java.util.concurrent.Semaphore;

class LuzRoja implements Runnable {

    Semaphore miSemaforo;
    Semaphore siguienteSemaforo;

    LuzRoja(Semaphore miSemaforo, Semaphore siguienteSemaforo) {
        this.miSemaforo = miSemaforo;
        this.siguienteSemaforo = siguienteSemaforo;
    }

    public void run() {
        try {
            miSemaforo.acquire();
            System.out.println("Luz roja encendida");
            Thread.sleep(3000);
            siguienteSemaforo.release();
        } catch (InterruptedException e) {}
    }

}
