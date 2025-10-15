public class Demo {
    void show(int a, double b){
        System.out.println("short");
    }
    void show(double a,int b){
        System.out.println("int");
    }
    public static void main(String[] args) {
        Demo o=new Demo();
        o.show(4d,5);
//

    }
}
