package String;

public class ReverseString_2 {

        public static void main(String[] args) {
            String str = "AjayMagar";
            System.out.println(str.length());
            char[] arr = str.toCharArray();
            String ch = "";

            for (int i = arr.length - 1; i >= 0; i--) {
                ch += arr[i];
            }

            System.out.println("Reversed String: " + ch);

        }


}
