package JavaBasics.p1;

public class TypeCasting {
    static {
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        int a=100;
        double d=a;
        System.out.println(a);
        System.out.println(d);//widening


        //Narrowing
        double dd=130.939;
    int aa=(int) dd;
        System.out.println(dd);
        System.out.println(aa);
    }

}
