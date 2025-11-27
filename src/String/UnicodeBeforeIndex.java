package String;

public class UnicodeBeforeIndex {

        public static void main(String[] args) {
            String name = "Ajay";
            int code = name.codePointBefore(2); // Gets Unicode before index 2
            System.out.println("Unicode code point before index 2: " + code);
            System.out.println(name.codePointAt(1));
        }
    }


