package Method;

public class Method {
    int age=19;
    String name ="java";
    int add(int a, int b){
        int c=a+b;
        return c;
    }
    void test(){
        System.out.println("test");
    }
    void sample(){
        System.out.println("This is sample method");
    }

    public static void main(String[] arg) {
        Method object1 = new Method();
        System.out.println("Access veriable " +object1.age);
        System.out.println("Access veriable " +object1.name);
        System.out.println(object1.add(10,20));
        object1.test();
        object1.sample();
        System.out.println(object1.add(5,5));
    }
}
