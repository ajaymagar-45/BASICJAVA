package MultiThreading;

public class MT_1 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());

    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MT_1 obj=new MT_1();
        obj.start();
//        System.out.println(Thread.currentThread());
//        Thread.currentThread().setName("JAVA");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(10/0);


//        obj.setName("java");

    }
}
