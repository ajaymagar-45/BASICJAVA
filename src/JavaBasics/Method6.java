package JavaBasics;
 class bath{
     int a=10;
     void tap(){
         System.out.println("tap");
     }

}

public class Method6 {

    int mix(int h,int v,int t){
        return h*v-t;

    }
    void fgg(){
        System.out.println("nothing");
    }
    void vn (char m,int v){
        System.out.println(m+ " " + v);

    }
    void  put(int t,char u,int d,boolean p){
        System.out.println(t +" " + u + " " + d + " " + p );

    }
    void dummyMethod(int a, String name){
        System.out.println("learning "+name);
    }
    public static void main(String[] args){
        Method6 obj1=new Method6();

        System.out.println(obj1.mix(10, 4, 3));
        obj1.fgg();
        obj1.vn('j',787);
        obj1.put( 88,'d',56,true);
        obj1.dummyMethod(30,"object");


        bath obj=new bath();
        obj.tap();
        System.out.println(obj.a);


    }

}
