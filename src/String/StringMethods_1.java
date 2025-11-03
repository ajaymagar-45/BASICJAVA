package String;
public class StringMethods_1 {
    public static void main(String[] args) {
        //1.Length()

        String A = "Ajay";
        System.out.println("Length: " + A.length());
        System.out.println("    ");

        //2. charAt(int index)
        String B = "Hello";
        System.out.println("Character at 2st index: " + B.charAt(2));
        System.out.println("    ");

        //3. concat(String str)
        String s1 = "Hello ";
        String s2 = "World";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println("    ");

        //4. equals(Object another)
        String o1 = "Java";
        String o2 = "java";
        System.out.println(o1.equals(o2));
        System.out.println("    ");

        //5. equalsIgnoreCase(String another)
        String st1 = "AJAY";
        String st2 = "ajay";
        System.out.println(st1.equalsIgnoreCase(st2));
        System.out.println("    ");

        //6. toUpperCase() and toLowerCase()
        String s = "Hello World";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println("    ");

        //7.trim()
        String m = "   Java  ";
        System.out.println("Before: '" + m + "'");
        System.out.println("After: '" + m.trim() + "'");
        System.out.println("    ");

        //8. substring(int beginIndex) and substring(int beginIndex, int endIndex)
        String p = "Programming";
        System.out.println(p.substring(3));
        System.out.println(p.substring(0, 6));
        System.out.println("    ");

        //9. contains(CharSequence seq)
        String st3 = "Learning Java";
        System.out.println(st3.contains("Java"));
        System.out.println("   ");

        //10. replace(CharSequence old, CharSequence new)
        String st4 = "Java Programming";
        System.out.println(s.replace("Java", "Python"));
        System.out.println("     ");

        //11.startsWith() and endsWith()
        String st5 = "HelloWorld";
        System.out.println(st5.startsWith("Hello"));
        System.out.println(st5.endsWith("World"));
        System.out.println("  ");

        //12.indexOf() and lastIndexOf()
        String st6 = "markram";
        System.out.println(st6.indexOf('a'));
        System.out.println(st6.lastIndexOf('a'));
        System.out.println(" ");

        //13. isEmpty()
        String st7 = "";
        System.out.println(s.isEmpty());
        System.out.println(" ");

        //14. split(String regex)
        String st8 = "apple,banana,grapes";
        String[] fruits = st8.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println(" ");

        //15. toCharArray()
        String st9 = "Java";
        char[] arr = st9.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }
        System.out.println(" ");

        //16. compareTo(String anotherString)
        String s10 = "A";
        String s11 = "B";
        System.out.println(s10.compareTo(s11));


    }
}

