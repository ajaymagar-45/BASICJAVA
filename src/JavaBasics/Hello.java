package JavaBasics;

public class Hello {
    public static void main(String[] args) {

        double a =40.66;
        System.out.println((a %=2));
        System.out.println(a +=7);
        System.out.println(a -=3);
        System.out.println(a *=3);
        Hello obj=new Hello();
        obj.m1();
        obj.abd(8723,true,'d',723878.2676,64.62f,26177677);
        obj.m2();
        System.out.println(obj.m3(6,8,9));
        int c=obj.m3(4,8,9);
        System.out.println(c);




    }
    void m1()
    {
        int a=10;
        int b=30;


        System.out.println(a+b);
        System.out.println(a);

    }
    void abd(int a,boolean b,char t,double y,float h,double j){
        System.out.println(a + " " + b + " " +  t + " " + y + " " + h + " " + j + " ");
    }
    void m2(){
        int s=45;
        System.out.println(++s);
        System.out.println(s*=8);
        System.out.println(s--);
        System.out.println(s);
        System.out.println(--s);

    }
    int m3(int i,int b,int g){
        return i*b*g;
    }
}
