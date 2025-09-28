package JavaBasics.p2;
class P1{
    int a;int b=29;
    P1(int a){
        System.out.println(a);
    }

    int ah(){
        System.out.println("kjj");
        return a

;

    }
    void op(int e){
        System.out.println(e);
    }
}

public class P extends P1{
    P(){
        super(190);

    }
    int ah(){
        System.out.println(super.b);
        return a;
    }

    public static void main(String[] args) {


        P1 n = new P();
        System.out.println(  n.ah());
    }
}
