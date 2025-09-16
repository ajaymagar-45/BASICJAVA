package Inheritance;

class main_4 {


    void A() {
        System.out.println(" Hello World");
    }

    void B() {
        System.out.println("Printing Integer value");
    }
    int a=37874;
}

  public class Inher_4 extends main_4 {


    public static void main(String[] args) {




        Inher_4 obj = new Inher_4();

         obj.A();

        obj.B();
        System.out.println("Given Value is: " + obj.a);


    }
}
