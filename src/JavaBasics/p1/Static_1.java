package JavaBasics.p1;

public class Static_1 {
    static int a=10;
   int b=20;

    public static void main(String[] args) {

        Static_1 o=new Static_1();
        Static_1 o1=new Static_1();
        Static_1 o2=new Static_1();
        o.b=21;
        o1.b=22;
        o2.b=23;

        o.a=11;
        o1.a=12;
        o2.a=13;
        System.out.println("for obj 1 " +" instance var "+ o.b +" static var  " + o.a);
        System.out.println("for obj 2 " +" instance var "+ o1.b +" static var  " + o1.a);
        System.out.println("for obj 3 " +" instance var "+ o2.b +" static var  " + o2.a);




    }
}
