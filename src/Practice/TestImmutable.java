package Practice;

import java.util.Date;

final class Person {  // 1️⃣ final class — cannot be extended
    private final String name;  // 2️⃣ final fields
    private final Date dob;     // mutable object handled carefully

    public Person(String name, Date dob) {
        this.name = name;
        // 3️⃣ Defensive copy of mutable object
        this.dob = new Date(dob.getTime());
    }

    public String getName() {
        return name;
    }

    // 4️⃣ Return defensive copy (not original object)
    public Date getDob() {
        return new Date(dob.getTime());
    }

    // 5️⃣ No setters — values can’t be changed
}

public class TestImmutable {
    public static void main(String[] args) {
        Date d = new Date();  // current date
        Person p1 = new Person("Ajay", d);

        System.out.println("Before change:");
        System.out.println(p1.getName() + " - " + p1.getDob());

        // Try to modify original Date (after object creation)
        d.setTime(0);  // changes 'd' but not inside Person

        // Try to modify through getter
        p1.getDob().setTime(0);  // changes copy, not internal state

        System.out.println("\nAfter attempting modifications:");
        System.out.println(p1.getName() + " - " + p1.getDob());
    }
}
