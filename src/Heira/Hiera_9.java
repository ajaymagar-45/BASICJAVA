package Heira;

class Sports {

    void A() { System.out.println("Sports"); }
}
class Cricket extends Sports{

    void B() { System.out.println("Cricket"); }
}
class Football extends Sports{

    void C(){
        System.out.println("2 Standard");
    }

}




public class Hiera_9 {
    public static void main(String[] args) {
        Football obj=new Football();
        obj.A();
        obj.C();
        System.out.println("********************");

      Cricket obj1=new Cricket();
        obj1.A();
        obj1.B();



    }
}
