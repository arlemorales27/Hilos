package ejemplo3;

class LuzVerde implements Runnable {

    public void run() {
        while (true) {
            System.out.println("Luz verde encendida");
            try {
                Thread.sleep(5000); // verde encendido 5 seg
            } catch (InterruptedException e) {
            }
        }
    }
}