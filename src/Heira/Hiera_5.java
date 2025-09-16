package Heira;


class fruits {

    void A() { System.out.println("Fruits"); }
}
class kiwi extends fruits {

    void B() { System.out.println("kiwi"); }
}
class orange extends fruits {

    void C(){
        System.out.println("Orange");
    }

}

public class Hiera_5 {
    public static void main(String[] args) {
        orange obj=new orange();
        obj.A();
        obj.C();

        kiwi obj1=new kiwi();
        obj1.A();
        obj1.B();

    }
}
