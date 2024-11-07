public class Thread1Exercise9 {
    private static Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new MyThread();

        thread1.start();

        Runnable task2 = new MyRunnable();

        Thread thread2 = new Thread(task2);
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished.");
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread 1 started");
            synchronized (lock) {
                System.out.println("Thread 1 acquired the lock");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 released the lock");
            }
            System.out.println("Thread 1 finished");
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread 2 started");
            synchronized (lock) {
                System.out.println("Thread 2 acquired the lock");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 released the lock");
            }
            System.out.println("Thread 2 finished");
        }
    }
}