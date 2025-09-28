package Inheritance;


class main_5 {


    char c='K';

    void Adc() {
        System.out.println(" Printing Charcter ");
    }

    void Bas() {
        System.out.println("Printing Integer value");
    }
    int a=37874;
}

public class Inher_5 extends main_5 {
    void Adc() {

        System.out.println(" Printing Charcter ");
//        super.Adc();
    }



    public static void main(String[] args) {




        Inher_5 obj = new Inher_5();

        obj.Adc();
        System.out.println("Given Charcter is : " +obj.c);

        obj.Bas();
        System.out.println("Given Value is: " + obj.a);


    }
}
