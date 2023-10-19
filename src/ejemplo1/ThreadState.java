package ejemplo1;

public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState o1;

    public static void main(String args[]) {
        o1 = new ThreadState();
        t1 = new Thread(o1);
        System.out.println("el estado del t1 es:" + " " + t1.getState());
        // lets invoke start() method on t1
        t1.start();
        // Now,Thread t1 is moved to runnable state
        System.out.println("después de la invocación del método start(), el estado de t1 es" + " " + t1.getState());
    }
    public void run() {
        Hilo4 g1 = new Hilo4();
        Thread t2 = new Thread(g1);
        // Thread is created and its in new state.
        t2.start();
        // Now t2 is moved to runnable state
        System.out.println("El estado de  Thread t2, la llamada posterior al método start () es" + " " + t2.getState());
        // create a try-catch block to set t1 in waiting
        // state
        try {
            Thread.sleep(202);
        } catch (InterruptedException i2) {
            i2.printStackTrace();
        }
        System.out.println(
                "El estado de Thread t2 después de invocar al método sleep () es" + " " + t2.getState());
        try {
            t2.join();
            System.out.println("El estado de Thread t2 después de join() es" + " " + t2.getState());
        } catch (InterruptedException i3) {
            i3.printStackTrace();
        }
        System.out.println(
                "state of Thread t1 after completing the execution is" + " " + t1.getState());
    }
}
