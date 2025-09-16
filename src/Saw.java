
class Was{
    void show(){
        System.out.println("This is Parent class Method");
    }
}
public class Saw extends Was {
   void show() {
        System.out.println("This is Child class Method");
    }




    public static void main(String[] args) {
//        Saw.show();
//        Was.show();
        Was s=new Saw();
        s.show();


//       Saw s1= new Saw();
//       s1.show();


//


    }
}

