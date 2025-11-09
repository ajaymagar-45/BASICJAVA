public class StringLiteralDemo {
    public static void main(String[] args) {
        // 1) Two literals with same content -> same reference (pooled)
        String s1 = "hello";
        String s2 = "hello";

        // 2) new String(...) -> new object, different reference
        String s3 = new String("hello");

        // 3) intern() returns pooled reference
        String s4 = s3.intern();

        // 4) compile-time concatenation is constant and pooled
        String s5 = "hel" + "lo"; // compile-time, becomes "hello" constant
        // 5) runtime concatenation creates a new String at runtime
        String part1 = "hel";
        String s6 = part1 + "lo"; // runtime, new String created

        // Print results using '==' (reference equality) and equals (value equality)
        System.out.println("s1 == s2 : " + (s1 == s2)); // expected true (both pooled)
        System.out.println("s1 == s3 : " + (s1 == s3)); // expected false (s3 is new object)
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true (same chars)

        System.out.println("s1 == s4 : " + (s1 == s4)); // true (interned s3 -> pooled reference)
        System.out.println("s1 == s5 : " + (s1 == s5)); // true (compile-time concat pooled)
        System.out.println("s1 == s6 : " + (s1 == s6)); // likely false (runtime concat -> new object)
        System.out.println("s6.intern() == s1 : " + (s6.intern() == s1)); // true after intern()

        // Show identityHashCode to illustrate different objects
        System.out.println("identityHashCode(s1) = " + System.identityHashCode(s1));
        System.out.println("identityHashCode(s2) = " + System.identityHashCode(s2));
        System.out.println("identityHashCode(s3) = " + System.identityHashCode(s3));
        System.out.println("identityHashCode(s4) = " + System.identityHashCode(s4));
        System.out.println("identityHashCode(s5) = " + System.identityHashCode(s5));
        System.out.println("identityHashCode(s6) = " + System.identityHashCode(s6));
    }
}
