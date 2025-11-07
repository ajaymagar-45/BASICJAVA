public class UseOfStaticMethod {
    static void meth(){
        System.out.println("Just implementing Static Method");

    }
    

    static int meth_(int a){
        System.out.println("Static int method");
        a=10;
        System.out.println(a);
        return 0;
    }
    public static void main(String [] args){
        meth();
        meth_(10);
    }
}

