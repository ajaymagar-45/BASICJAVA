package String;

public class CaseInsensitive {

        public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "hello";

            if (s1.equalsIgnoreCase(s2)) {
                System.out.println("Strings are equal (ignoring case)");
            } else {
                System.out.println("Strings are NOT equal");
            }
        }
    }


