package String;

public class ReverseString_3 {

        public static void main(String[] args) {
            String str = "Ajay";

            System.out.print("Reversed String: ");
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        }


}
