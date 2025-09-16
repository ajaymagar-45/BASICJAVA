package Inheritance;

class main_10 {



    void A() {
        System.out.println(" trying simple inheritance ");
    }

    void B() {
        System.out.println("Printing Integer value");
    }
    int a=475874;
    char c='o';
    float f=73587.57f;
    double d=385665763475767.65747657;
}

public class Inher_10 extends main_10 {


    public static void main(String[] args) {




        Inher_10 obj = new Inher_10();

        obj.A();


        obj.B();
        System.out.println("Given Value is: " + obj.a);
        System.out.println("Given charcter is: " + obj.c);
        System.out.println("Gicen Floating Value Is : " + obj.f);
        System.out.println("Given Value is : " + obj.d);


    }
}
