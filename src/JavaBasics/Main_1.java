package JavaBasics;

class Student_1 {
    private String name;  // private variable
    private int age;

    // Setter for name
    public void setName(String n) {
        name = n;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int a) {
        if(a > 0) {  // simple validation
            age = a;
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class Main_1 {
    public static void main(String[] args) {
        Student_1 s = new Student_1();

        // Setting values
        s.setName("Ajay");
        s.setAge(25);

        // Getting values
        System.out.println(s.getName()); // Ajay
        System.out.println(s.getAge());  // 25
    }
}
