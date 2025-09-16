package ControlFlow;

public class p1 {
    static int d;
    int b=30;
    String day;
    static String ok;
    static char c='a';
    static boolean bbb;


    void abc(int aa,int bb){
        int a=100;

        System.out.println(a);
        System.out.println(aa);


    }


    public static void main(String[] args) {
        System.out.println(p1.d);
        p1 obj= new p1();
        System.out.println( obj.b);
        obj.abc(10 ,20);
        System.out.println(obj.day);
        System.out.println(p1.ok);

        System.out.println(p1.c);
        System.out.println(p1.bbb);


        }
    }


