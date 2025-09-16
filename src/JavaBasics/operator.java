package JavaBasics;

public class operator {


    public static void main(abc[] args) {

        int a=10;
        int b=20;


        boolean r = b == 20;
        System.out.println("Result " +r);
        boolean r1=(a <=b && b >=a);
        System.out.println("Result1 " + r1);
        boolean r2=(a>b && b>a);
        System.out.println("Result2 " +r2);
        boolean r3=(a>b && b<a);
        System.out.println("Resultr3 " + r3);



        int c=10;
        int d=20;
        int e=30;

        boolean r4 =(c==10 ||d==20);
        System.out.println("\nResult " +r4);
        boolean r5=(c <d || d<e ||e>d);
        System.out.println("Result  "+r5);
        boolean r6=(c >d || d<e);
        System.out.println("Result  " +r6);
        boolean r7=(c >d || d >e);
        System.out.println("Result  " +r7);

        int f=100;
        int g=200;

        boolean r8=(f!=g);
        System.out.println("\nResult " +r8);

        int h=100;
        int i=100;
        boolean r9=(h!=i);
        System.out.println("Result "+r9);



    }

    public static class Method5 {

        int mul(int q,int e,int t){
            return q*e*t;

        }
        void asg(){
            System.out.println("nothing");
        }
        void cad (char m,int v){
            System.out.println(m+ " " + v);

        }
        void  hold(int t,char u,int d,boolean p){
            System.out.println(t +" " + u + " " + d + " " + p );

        }
        void dummyMethod(int a, String name){
            System.out.println("learning "+name);
        }
        char uiu(char i){
            return 'i';

        }
        public static void main(String[] args){
            Method5 obj1=new Method5();

            System.out.println(obj1.mul(9, 7, 9));
            obj1.asg();
            obj1.cad('i',9);
            obj1.hold( 6,'d',9,false);
            obj1.dummyMethod(30,"object");
            System.out.println(obj1.uiu('h'));

        }

    }
}
