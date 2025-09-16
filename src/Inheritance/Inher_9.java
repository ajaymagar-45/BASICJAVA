package Inheritance;

class main_9 {



    void A() {
        System.out.println(" trying simple inheritance ");
    }

    void B() {
        System.out.println("Printing Integer value");
    }
    int a=474;
    char c='o';
    float f=48.487f;
}

public class Inher_9 extends main_9 {


    public static void main(String[] args) {




        Inher_9 obj = new Inher_9();

        obj.A();


        obj.B();
        System.out.println("Given Value is: " + obj.a);
        System.out.println("Given charcter is: " + obj.c);
        System.out.println("Gicen Floating Value Is : " + obj.f);


    }
}
