package String;

public class UnicodeAtIndex {
     public static void main(String[] args) {
            String name = "Ajay";
//            int code = name.codePointAt(0); // Get Unicode of character at index 0
//            System.out.println("Unicode code point at index 0: " + code);
        System.out.println(name.codePointAt(0));
        String s1="TRY";
         System.out.println(s1.codePointAt(0));
         System.out.println(s1.codePointBefore(1));
         System.out.println(s1.codePointCount(1,s1.length()));
        }
    }


