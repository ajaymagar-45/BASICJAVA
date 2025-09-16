package JavaBasics.p2;

public class Basic {
    public static void main(String[] args) {
        byte aa=10;
        byte bb=20;
        byte cc=(byte) (aa + bb);
        System.out.println(cc);
        System.out.println('a' +'b');
        System.out.println('a'+.89);
        //**********************************
        System.out.println(10/0.0);
        System.out.println(-10/0.0);
        System.out.println(0.0/0);//NaN(Not a Number)
        System.out.println(-0.0/0);
        System.out.println(10!=Float.NaN);
        System.out.println(Float.NaN!=Float.NaN);
      System.out.println(10/0);
      System.out.println(0/0);

    }
}
