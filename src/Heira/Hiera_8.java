package Heira;

class Mobile {

    void A() { System.out.println("Mobile"); }
}
class vivo extends Mobile {

    void B() { System.out.println("Vivo"); }
}
class oppo extends Mobile{

    void C(){
        System.out.println("oppo");
    }

}




public class Hiera_8 {
    public static void main(String[] args) {
       oppo obj=new oppo();
        obj.A();
        obj.C();
        System.out.println("********************");

        vivo obj1=new vivo();
        obj1.A();
        obj1.B();



    }
}
