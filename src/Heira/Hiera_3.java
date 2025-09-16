package Heira;


class Birds{
    void A(){
        System.out.println("Birds");

    }
}

class Parrot extends Birds{
    void B(){
        System.out.println("Parrot");
    }

}

class sparrow extends Birds{
    void C1(){
        System.out.println("sparrow");
    }

}

class peacock extends Birds{
    void D(){
        System.out.println("peacock");
    }
}

public class Hiera_3 {
    public static void main(String[] args) {


        peacock obj=new peacock();
        obj.D();
        obj.A();
        System.out.println("***********");

        sparrow ok=new sparrow();
        ok.C1();


        ok.A();


    }
}
