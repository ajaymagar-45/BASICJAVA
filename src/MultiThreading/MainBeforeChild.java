package MultiThreading;
class Demoa extends Thread{
    static Thread mt;
    public void run(){
        try{mt.join(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++){
            System.out.println("Child thread");
        }



    }
}

public class MainBeforeChild {
    public static void main(String [] args)throws InterruptedException{
        Demoa.mt=Thread.currentThread();
        Demoa t=new Demoa();
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }
    }
}
