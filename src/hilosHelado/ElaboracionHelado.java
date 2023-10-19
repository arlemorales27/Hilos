package hilosHelado;

public class ElaboracionHelado {
    public static void main(String[] args) {
        Thread prepararMezcla = new Thread(new PrepararMezcla());
        Thread enfriarMezcla = new Thread(new EnfriarMezcla());
        Thread servirHelado = new Thread(new ServirHelado());

        prepararMezcla.start();
        enfriarMezcla.start();
        servirHelado.start();
    }
    public static class PrepararMezcla implements Runnable {
        @Override
        public void run() {
            System.out.println("Preparando la mezcla del helado...");
            try {
                Thread.sleep(3000); // Simula 3 segundos de preparación
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("La mezcla quedo en el punto exacto");
        }
    }

    public static class EnfriarMezcla implements Runnable {
        @Override
        public void run() {
            System.out.println("Enfriando la mezcla...");
            try {
                Thread.sleep(1900); // Simula 2 segundos de enfriamiento
                System.out.println("La mezcla está fría.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ServirHelado implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(2000); // Simula 2 segundos de servir
                System.out.println("Sirviendo el helado...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("El helado está listo para disfrutar.");
        }
    }
}
