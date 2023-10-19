package ejemplo3;

class LuzRoja implements Runnable {
    public void run() {
        while(true) {
            System.out.println("Luz roja encendida");
            try {
                Thread.sleep(3000); // rojo encendido 3 seg
            } catch(InterruptedException e) {}
        }
    }
}
