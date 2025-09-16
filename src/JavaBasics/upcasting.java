package JavaBasics;
class demo4{
  static void  au(){
        System.out.println("Class to be cast");

    }


}

public class upcasting extends demo4 {
  static void au(int a){
        System.out.println("Child class");


    }
    public static void main(String[] args) {

  demo4 obj=new upcasting();
   obj.au();



    }
}
