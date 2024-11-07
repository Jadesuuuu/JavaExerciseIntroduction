package bonifacio_L18Activity1;

import java.util.concurrent.TimeUnit;

public class Printer implements Runnable {
    private String documentName;

    public Printer(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public void run() {
        printDocument();
    }

    private void printDocument() {
        System.out.println("Printing: " + documentName);
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished printing: " + documentName);
    }
}
