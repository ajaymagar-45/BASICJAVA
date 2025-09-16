package Multi;

class a1{
    void A1(){
        System.out.println("A + B ");
    }
}
class b1 extends a1{
    void B1(){
        System.out.println("=");
    }
}
class c1 extends b1{
    void C1(){
        System.out.println("c");

    }
}



public class MultiLevel_4 {
    public static void main(String[] args) {
        c1 obj = new c1();
        obj.A1();
        obj.B1();
        obj.C1();

    }
}
