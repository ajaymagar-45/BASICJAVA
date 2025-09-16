package Inheritance;

class main_8 {



    void A() {
        System.out.println(" trying simple inheritance ");
    }

    void B() {
        System.out.println("Printing Integer value");
    }
    int a=2378474;
    char c='Z';
}

public class Inher_8 extends main_8 {


    public static void main(String[] args) {




        Inher_8 obj = new Inher_8();

        obj.A();


        obj.B();
        System.out.println("Given Value is: " + obj.a);
        System.out.println("Given charcter is: " + obj.c);


    }
}
