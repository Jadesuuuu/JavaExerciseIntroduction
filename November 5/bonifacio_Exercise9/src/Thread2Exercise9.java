import java.util.LinkedList;
import java.util.Queue;

public class Thread2Exercise9 {
    public static void main(String[] args) {
        Queue<String> messageQueue = new LinkedList<>();

        messageQueue.add("Hello");
        messageQueue.add("My name is JavaBot");
        messageQueue.add("Nice to meet you!");

        Thread messageProcessor = new Thread(() -> {
            while (!messageQueue.isEmpty()) {
                String message = messageQueue.poll();
                System.out.println("Sending: " + message);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        messageProcessor.start();
    }
}