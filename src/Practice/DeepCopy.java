package Practice;
class Address implements Cloneable {
    String city;
    Address(String city) { this.city = city; }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // clone primitive and String fields
    }
}

class Student implements Cloneable {
    String name;
    Address address;

    Student(String name, String city) {
        this.name = name;
        this.address = new Address(city);
    }

    // Deep copy
    protected Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.address = (Address) address.clone(); // clone nested object
        return cloned;
    }
}

class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Ajay", "Pune");
        Student s2 = (Student) s1.clone();

        s2.address.city = "Mumbai";

        System.out.println(s1.address.city); // Pune
        System.out.println(s2.address.city); // Mumbai
    }
}
