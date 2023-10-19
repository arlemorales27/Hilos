package ejemplo3;

public class SemaforoVial {
    public static void main(String[] args) {

        // Crear hilos para los colores del semáforo
        Thread rojo = new Thread(new LuzRoja());
        Thread ambar = new Thread(new LuzAmbar());
        Thread verde = new Thread(new LuzVerde());

        // Establecer prioridades
        rojo.setPriority(Thread.MAX_PRIORITY);
        ambar.setPriority(Thread.NORM_PRIORITY);
        verde.setPriority(Thread.MIN_PRIORITY);

        // Iniciar hilos
        rojo.start();
        ambar.start();
        verde.start();

    }
}
