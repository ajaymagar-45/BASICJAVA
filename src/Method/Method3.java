package Method;


public class Method3 {

    int add(int o,int h,int i){
        return o+h+i;

    }
    void ok(){
        System.out.println("void is for Nothing");
    }
    void ip (char y,int b){
        System.out.println(y + " " + b);

    }
    void  sign(int a,char c,int d){
        System.out.println(a +" " + c + " " + d );

    }
    void dummyMethod(int a, String name){
        System.out.println("Dummy method takes String argument "+name);
    }
    public static void main(String[] args){
        Method3 obj1=new Method3();

        System.out.println(obj1.add(7, 27, 39));
        obj1.ok();
        obj1.ip('h',90);
        obj1.sign( 10,'d',9);
        obj1.dummyMethod(30,"java");



    }

}
