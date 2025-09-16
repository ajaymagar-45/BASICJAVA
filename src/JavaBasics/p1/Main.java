package JavaBasics.p1;
interface  inter{
    void i();
}
interface  inter1 extends inter{
    @Override
    void i();
}
class inter3 implements inter{
    public void i(){
        System.out.println("OKK");
    }

    public static void main(String[] args) {
        inter3 o=new inter3();
        o.i();
    }

}

class Person  {

    Person(int a) {
        System.out.println("Person: Default constructor");
    }

    Person(String name) {
        System.out.println("Person: Name = " + name);
    }
}

class Student extends Person {
    Student() {
        this("Ajay"); // Calls Student(String) constructor
        System.out.println("Student: Default constructor");
    }

    Student(String name) {
        super(name); // Calls Person(String) constructor
        System.out.println("Student: Name constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // Start with default
    }


}

