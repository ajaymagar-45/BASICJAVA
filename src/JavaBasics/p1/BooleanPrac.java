package JavaBasics.p1;

public class BooleanPrac {
    boolean boo(int a){
        System.out.println("Boolean Method " + a);
        return true;
    }
    int a(int aa){
        return  aa+11;

    }

    public static void main(String[] args) {
        BooleanPrac obj=new BooleanPrac();
        obj.boo(10);
        System.out.println(obj.a(10));
    }
}
