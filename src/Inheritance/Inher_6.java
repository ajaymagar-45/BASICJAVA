package Inheritance;

class main_6 {


    float f=899.22f;

    void A() {
        System.out.println(" Printing Floating point value ");
    }

    void B() {
        System.out.println("Printing Integer value");
    }
    int a=74764;
}

public class Inher_6 extends main_6 {


    public static void main(String[] args) {




        Inher_6 obj = new Inher_6();

        obj.A();
        System.out.println("Given value is : " +obj.f);

        obj.B();
        System.out.println("Given Value is: " + obj.a);


    }
}
