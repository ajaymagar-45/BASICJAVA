package Method;

public class Method2 {
    void exm(int a,char b, boolean d,double e,float f){
        System.out.println(a + " " +b +" " + d +" " + e + " " + f  );

    }
    int add(int a, int b) {
        return a * b;

    }

    public static void main(String [] arg){
        Method2 obj=new Method2();
        obj.exm(47,'n',true,78909.989,746.737f);
        int r=87;
        System.out.println(r++);
        System.out.println(r);
        System.out.println(++r);

        System.out.println(r);
        System.out .println(obj.add(40,70));

        System.out.println(obj.m2(19,78,79,26));
        obj.m3(89,'d',true,678.75f);


    }
    double m2(int a,int b,int c,int d){
        return a*b+c+d;
    }
    void m3(int q,char d,boolean h,float f){
        System.out.println(q +" "+ d +" "+h +" " +f);
    }

}
