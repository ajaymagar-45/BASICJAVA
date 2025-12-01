package Inheritance;

class main_2 {


    char c='c';

    void test(int a,int b) {
        System.out.println(a+b);
    }


    void ok() {
        System.out.println("Printing Charcter");
    }
}


public class Inher_2 extends main_2 {
    void ok (){
        System.out.println("Child class");
    }


    public static void main(String[] args) {




        Inher_2 obj = new Inher_2();
        obj.ok();










//        obj.test(10,20);
//
//        System.out.println("given character is " + obj.c);
//        obj.ok();


    }
}
