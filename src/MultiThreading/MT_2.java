package MultiThreading;
class Demo implements Runnable{
    public void run() {

//        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("I have higest priority");


    }

}

public class MT_2 {
    public static void main(String[] args) {

        Demo g=new Demo();


        Thread t=new Thread(g);
        t.setPriority(10);
        t.start();

//        System.out.println(Thread.MIN_PRIORITY);
//        System.out.println(Thread.currentThread().getPriority());
        System.out.println("I will execute after child thread get execute ");









    }
}
