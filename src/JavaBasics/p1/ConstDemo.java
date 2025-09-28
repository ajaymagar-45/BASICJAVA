package JavaBasics.p1;
class Op{
    int io=2786;

}

public class ConstDemo extends Op {
    int  cv=100;
    int id;
    String str;
    void asd(){
        System.out.println(cv);
        System.out.println(super.io);
    }


    ConstDemo() {
        this(10, "Ajay");
        System.out.println("Hello");

    }

    ConstDemo(int id, String str) {
        this.id = id;
        this.str = str;
        System.out.println("Para");

    }






    public static void main(String[] args) {
        ConstDemo obj=new ConstDemo();
        obj.asd();
        System.out.println(obj.str + " "+ obj.id);

    }}


