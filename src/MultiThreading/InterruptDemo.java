package MultiThreading;
class MyThread extends Thread {
    @Override
    public void run() {
        // Child thread loop
        for (int i = 1; i <= 5; i++) {

            System.out.println("Child Thread: " + i);

            try {
                Thread.sleep(500); // Sleeping so interruption can affect it
            } catch (InterruptedException e) {
                System.out.println("Child Thread got interrupted!");
               // Stop loop when interrupted
            }
        }

    }
}

public class InterruptDemo {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();
        t.interrupt();

        // Main thread loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);

            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }


        }


    }
}

