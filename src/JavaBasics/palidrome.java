package JavaBasics;
public class palidrome {
    public static void main(String[] args) {
        int a = 121;  //
        int originalNumber =a;
        int reversed = 0;


        while (a != 0) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a = a / 10;
        }


        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a Palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a Palindrome number.");
        }
    }
}



