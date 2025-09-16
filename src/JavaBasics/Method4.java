package JavaBasics;

public class Method4 {

    int mul(int l,int h,int u){
        return l*h*u;

    }
    void asd(){
        System.out.println("nothing");
    }
    void dfg (char k,int s){
        System.out.println(k + " " + s);

    }
    void  hold(int a,char c,int d,boolean e){

        System.out.println(a +" " + c + " " + d + " " + e );

    }
    void dummyMethod(int a, String name){
        System.out.println("learning "+name);
    }
    public static void main(String[] args){
        Method4 obj1=new Method4();

        System.out.println(obj1.mul(7, 27, 39));
        obj1.asd();
        obj1.dfg('h',90);
        obj1.hold( 10,'d',9,false);
        obj1.dummyMethod(30,"object");

    }


}
class a{
    public static void main(String[] args) {
        System.out.println("Ajay");
    }
}
