//class B{
//    static void b(){        System.out.println("This is static Method");}
//}
public class pro {
    static void A(){
       System.out.println("This is static Method");
    }

    public static void main(String[] args) {
        pro obj=new pro();
        obj.A();


//        B obj=new B();
//        obj.b();
    }
}
