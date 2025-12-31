package MultiThreading;

public class MainThreadcallingItself {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join(200);
    }
}
