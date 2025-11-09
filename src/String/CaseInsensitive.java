package String;

public class CaseInsensitive {

        public static void main(String[] args) {
//            String s1 = "Hello";
//            String s2 = "hello";
//
//            if (s1.equalsIgnoreCase(s2)) {
//                System.out.println("Strings are equal (ignoring case)");
//            } else {
//                System.out.println("Strings are NOT equal");
//            }

            String a="AJAY";
            String S3=a.intern();
            System.out.println(S3);
            System.out.println(a.charAt(1));
            String b="ajay";
            if(a.equalsIgnoreCase(b))
                System.out.println(" given Strings are same in ignoring the case");

            else
                System.out.println("Given strings are not equal");


        }
    }


