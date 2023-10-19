package ejemplo3;

class LuzAmbar implements Runnable {

    public void run() {
        while(true) {
            System.out.println("Luz ámbar encendida");
            try {
                Thread.sleep(2000); // ámbar encendido 2 seg
            } catch(InterruptedException e) {}
        }
    }

}
