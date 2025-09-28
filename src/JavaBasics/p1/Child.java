package JavaBasics.p1;
class Parent {
    private int vvv=70;
interface a{ }
    int a = 10;

    void ab() {
        this.ba();
        System.out.println("parent class Method");
        System.out.println(vvv);
    }

    void ba() {
        System.out.println("Second Child Class method");
    }
}

public class Child extends Parent{
    int a=20;

    @Override
    void ab() {

        System.out.println(super.a);
        System.out.println("Child class Method");
    }


    void aw(int a){



        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Child obj=new Child();
       obj.ab();

//        System.out.println(obj.a);
//        Parent obj1=new Parent();
//        obj1.ab();
    }
}
