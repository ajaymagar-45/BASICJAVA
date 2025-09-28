package JavaBasics.p1;

public class Ok1{
//    String str="Ajay";
   int a=10;
    Ok1(){

        this("aj",10);
        System.out.println(this.a);

    }
    Ok1(String name , int a){
//        this.str=name;
//        this.a=a;

        System.out.println(name + a);


    }

    public static void main(String[] args) {
        Ok1 obj=new Ok1();
    }
}