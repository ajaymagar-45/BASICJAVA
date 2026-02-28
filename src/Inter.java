interface I1 extends N{
 default int v1(){
     System.out.println("I am from I1");
     return 0;
 }
 default void n(){}
 static  void g(){}



}
interface  N{
    default int v1(){
        System.out.println("I am from N");
        return 0;
    }
}


public class Inter implements I1,N{
    @Override
    public int v1(){
        I1.super.v1();

        return 0;

            }




    public static void main(String[] args) {

        Inter i=new Inter();
        i.v1();




    }
}
