package Heira;

class School {

    void A() { System.out.println("Modern English School"); }
}
class first_stand extends School {

    void B() { System.out.println("1 Standard"); }
}
class second_stand extends School{

    void C(){
        System.out.println("2 Standard");
    }

}




public class Hiera_4 {
    public static void main(String[] args) {
        second_stand obj=new second_stand();
        obj.A();
        obj.C();
        System.out.println("********************");

        first_stand obj1=new first_stand();
        obj1.A();
        obj1.B();



    }
}
