package String;

public class RevereseString {

        public static void main(String[] args) {
            String str = "hello";
            String ch = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                ch = ch + str.charAt(i);

            }

            System.out.println("Reversed String: " + ch);

    }

}
