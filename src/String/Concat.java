package String;

public class Concat {

        public static void main(String[] args) {
            String str1 = "Hello ";
            String str2 = "World!";

            // Method 1: Using concat()
            String result = str1.concat(str2);
            System.out.println("Using concat(): " + result);

            // Method 2: Using + operator
            String result2 = str1 + str2;
            System.out.println("Using + operator: " + result2);
        }


}
