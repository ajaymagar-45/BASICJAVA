package MultiThreading;
class Child extends Thread{
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();


            }
        }
    }
}

public class MT_3 {
    public static void main(String[] args) throws InterruptedException{
      Child t=new Child();
        t.start();
        t.join(10000);
        for(int i=0;i<10;i++){
            System.out.println("Parent Thread");
        }

    }

}
