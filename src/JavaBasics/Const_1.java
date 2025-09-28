package JavaBasics;

public class Const_1 {
    int a;
    String str;
    Const_1(){
        this("ok",10);
        System.out.println("Child ");
    }
    Const_1(String str,int a){
        this.str=str;
        this.a=a;
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Const_1 obj=new Const_1();
    }
}
