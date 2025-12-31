package MultiThreading;
class Child extends Thread{
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Child Thread");
            try{

                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.getMessage();


            }

        }

    }
}

public class MT_3 {
    public static void main(String[] args) {
      Child t=new Child();
        t.start();
       try {t.join(500);} catch (InterruptedException e) {
           throw new RuntimeException(e);
       }



           for (int i = 0; i < 10; i++)  {
               System.out.println("Parent Thread");


                   }



           }
       }



