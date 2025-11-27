package Practice;
import java.util.Date;
import java.util.Objects;

final class ImmutablePerson {
    private final String name;
    private final Date dob;

    public ImmutablePerson(String name, Date dob) {
        this.name = name;
        this.dob = new Date(dob.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return new Date(dob.getTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dob);
    }

    @Override
    public String toString() {
        return name + " - " + dob;
    }
}

public class TestImmutableHash {
    public static void main(String[] args) {
        Date d = new Date();
        ImmutablePerson p = new ImmutablePerson("Ajay", d);
        System.out.println("Before change: " + p);
        System.out.println("HashCode: " + p.hashCode());

        // Try to modify Date
        d.setTime(0);
        p.getDob().setTime(0); // modifies copy, not internal data

        System.out.println("\nAfter attempting modification: " + p);
        System.out.println("HashCode: " + p.hashCode());
    }
}


