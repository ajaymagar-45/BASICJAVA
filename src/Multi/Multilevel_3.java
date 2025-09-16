package Multi;
class a{
    void A(){
        System.out.println("Executing MultiLevel Inhheritance ");
    }
}
class b extends a{
    void B(){
        System.out.println("*");
    }
}
class c extends b{
    void C(){
        System.out.println("try");

    }
}

public class Multilevel_3 {
    public static void main(String[] args) {
        c obj=new c();
        obj.A();
        obj.B();
        obj.C();



    }

}
