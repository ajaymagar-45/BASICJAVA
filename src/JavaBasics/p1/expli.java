package JavaBasics.p1;
class A{
    void a(){
        System.out.println("Child class Method");
    }
}

public class expli extends A{
    void a(){
        System.out.println("Child class Method");
    }

    public static void main(String[] args) {
        expli obj=(expli) new A();
        obj.a();

    }
}
