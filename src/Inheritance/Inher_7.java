package Inheritance;

class main_7 {


    double d=89454759.258542;

    void A() {
        System.out.println(" Printing Floating point value ");
    }

    void B() {
        System.out.println("Printing Integer value");
    }
    int a=80948234;
    char c='t';
}

public class Inher_7 extends main_7 {


    public static void main(String[] args) {




        Inher_7 obj = new Inher_7();

        obj.A();
        System.out.println("Given value is : " +obj.d);

        obj.B();
        System.out.println("Given Value is: " + obj.a);
        System.out.println("Given charcter is: " + obj.c);


    }
}
