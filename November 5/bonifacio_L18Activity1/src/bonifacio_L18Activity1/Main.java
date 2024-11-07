package bonifacio_L18Activity1;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer("Manuscript_Final.pdf");
        Thread thread1 = new Thread(printer1, "Thread-1");

        Printer printer2 = new Printer("Manuscript_Final_Final.pdf");
        Thread thread2 = new Thread(printer2, "Thread-0");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread-1 status: " + (thread1.isAlive() ? "running" : "terminated"));
        System.out.println("Thread-0 status: " + (thread2.isAlive() ? "running" : "terminated"));

        System.out.println("Threads have ended.");
    }
}
