package ejemplo1;

public class MiClase {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static class MyRunnable implements Runnable {
        private String threadName;

        public MyRunnable(String threadName) {
            this.threadName = threadName;
        }

        public void run() {
            for (int i = 0; i < 4; i++) {
                System.out.println(threadName + ": " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
