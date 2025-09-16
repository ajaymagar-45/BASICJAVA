package Inheritance;

class main_3 {



    void Abc() {
        System.out.println(" Simple Inheritance");
    }

    void Bas() {
        System.out.println("Learning inheritance");
    }
}

public class Inher_3 extends main_3 {


    public static void main(String[] args) {




        Inher_3 obj = new Inher_3();

        obj.Abc();
        obj.Bas();


    }
}
