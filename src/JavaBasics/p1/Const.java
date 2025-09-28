package JavaBasics.p1;
class ok{
    int a;
   ok (String abc){

        System.out.println("Parent class Constructor " +abc);
    }
    void lp(){

        System.out.println("Method");
    }
}

public class Const  extends ok{

    static {

        System.out.println("static Consstructor");

    }
    void lp(){

        System.out.println(super.a);
        super.lp();
    }
   Const(){
super("lop");
        {

            System.out.println(super.a);
            System.out.println("Instance block");
        }
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Const obj=new Const();
        obj.lp();

    }
}
