package Practice;

public class ReverseByForLoop {
        public static void main(String[] args) {
            int num = 9876;
            int reversed = 0;

            for (; num != 0; num /= 10) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
            }

            System.out.println("Reversed number: " + reversed);
        }//
    }


