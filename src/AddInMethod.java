import java.util.ArrayList;
import java.util.List;
interface  A11{
    Object  add(Object a,Object b);

}
public class AddInMethod implements A11 {
    public Object add(Object a,Object b){

     return a +" "+ b;
    }
    boolean check(int aaa){

      return aaa%2==0  ;

    }
//    Object add(Object a,Object b){
//        return a + " "+b;


//    }
    int c(int a){
        if(a>5)
            return 1;
        else
            return 0;


       }

       boolean trueFalse(int a){
        if(a%2==0){
            return true;
        }
        else {
            return false;
        }
       }

    public static void main(String[] args) {
        AddInMethod o = new AddInMethod();
//
//        System.out.println(o.check(5));
//        System.out.println(o.c(2));
        System.out.println(o.trueFalse(3));


    }
}
