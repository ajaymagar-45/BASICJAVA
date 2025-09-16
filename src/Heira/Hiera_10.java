package Heira;

class Laptop {

    void A() { System.out.println("Laptop"); }
}
class HP extends Laptop {

    void B() { System.out.println("laptop Company Name:HP"); }
}
class DELL extends Laptop{

    void C(){
        System.out.println("laptop Company Name:DELL");
    }

}




public class Hiera_10 {
    public static void main(String[] args) {
        DELL obj=new DELL();
        obj.A();
        obj.C();
        System.out.println("********************");

        HP obj1=new HP();
        obj1.A();
        obj1.B();



    }
}
