public class Demo {
    void show(int a, long b){
        System.out.println("short");
    }
    void show(long a,int b){
        System.out.println("int");
    }
    public static void main(String[] args) {
        Demo o=new Demo();
        o.show(4,5l);
//

    }
}
