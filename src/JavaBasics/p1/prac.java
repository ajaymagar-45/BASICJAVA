package JavaBasics.p1;
class B{
    int a;
    B(){

        System.out.println("Constructor of B class");
    }
    B(int a){

        System.out.println(a);
    }
}

public class prac extends B {
    static int ad;
     prac(){





        System.out.println("use of : this");
    }
    prac(int a){
        System.out.println("constructor");
    }





   final public static void main(String[] args) {
        prac obj=new prac();










    }

    public static void main(int a) {

    }
}
