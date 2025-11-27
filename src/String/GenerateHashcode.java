package String;

public class GenerateHashcode {
    // Define a public class named Exercise18.

        // Define the main method.
        public static void main(String[] args) {
            // Declare and initialize a string variable.
            String str = "Python Exercises.";

            // Get the hash code for the string.
            int hash_code = str.hashCode();

            // Display the hash code.
            System.out.println("The hash for " + str +
                    " is " + hash_code);
            String S1="Hashcode";
            System.out.println(S1.hashCode());
            String S2="First String ";
            String S3="Second String";
            System.out.println(S2 + S3);
            String str1="AJAY";
            String str2="aJAY";
            System.out.println(str1.equalsIgnoreCase(str2));

        }


}
