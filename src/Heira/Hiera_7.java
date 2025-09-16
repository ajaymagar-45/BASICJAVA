package Heira;

class cars {

    void A() { System.out.println("cars"); }
}
class valvo extends cars {

    void B() { System.out.println("Valvo"); }
}
class swift extends cars{

    void C(){
        System.out.println("Swift");
    }

}




public class Hiera_7 {
    public static void main(String[] args) {
        swift obj=new swift();
        obj.A();
        obj.C();
        System.out.println("********************");

        valvo obj1=new valvo();
        obj1.A();
        obj1.B();



    }
}
