package Multi;

class Tree{
    void A(){
        System.out.println("Tree ");
    }
}
class Branch extends Tree{
    void B(){
        System.out.println("Branch");
    }
}
class Roots extends Branch {
    void C() {
        System.out.println("Roots");

    }
}
class fruit extends Roots{
    void D(){}
}

    public class MultiLevel_5 {
        public static void main(String[] args) {
            fruit obj = new fruit();
            obj.A();
            obj.B();
            obj.C();
            obj.D();


        }

    }

