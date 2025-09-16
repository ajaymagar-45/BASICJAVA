package JavaBasics;

public class controlFlow {
    public static void main(String[] arg) {
        int a = 10;
        int b=20;
        if(a>b ||a==b)
        if (a < 100) {
            System.out.println("a is smaller than 100");
        }
        if (a<b){
            System.out.println("a is smaller tham b");

        }
        else {
            System.out.println("b is Methods.greater");
        }
        if(a==b){
            System.out.println("both are equal");
        }
        else{
            System.out.println("given input is not matched");
        }



    }

    public static class Typecasting {
        public static void main(String[] args) {
            int c = 9;
            double d= c;
            int a=2;
            double b=a;
            double e=124.6;
            int n=(int) e;
            double y=56.89;
            int t=(int) y;
            System.out.println(c);
            System.out.println(d);
            System.out.println(a);
            System.out.println(b);
            System.out.println(e);
            System.out.println(n);
            System.out.println(y);
            System.out.println(t);
        }

    }
}
