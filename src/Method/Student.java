package Method;

public class Student {
    void afg(int a,int b,boolean c){
        System.out.println(a +" " + b + " " + c + " ");

    }
    int ah (int a){
        return a;
    }
    void  hdfg(int a,int v,boolean vj){
        System.out.println(a + " " + v + " " + vj + " " );

    }
    public static void main(String[] args){
        Student obj=new Student();
        obj.afg(34,89,true);
        System.out.println( obj.ah(30));
        obj.hdfg(47,67,true);
    }
}
