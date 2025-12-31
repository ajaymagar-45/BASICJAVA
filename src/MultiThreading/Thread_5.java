package MultiThreading;

public class Thread_5 extends Thread {
    public void run(){

        Thread.currentThread().setName("Java");


        System.out.println(  Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        Thread_5 obj=new Thread_5();
        obj.start();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().getName();


    }
}
