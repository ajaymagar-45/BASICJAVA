package JavaBasics;

public class p7 {

        public static void main(String[] args) {
            System.out.println("The first 10 natural numbers are:");
            printNumbers(1);
        }

        public static void printNumbers(int n) {
            if (n > 10) return;

            System.out.println(n);
            printNumbers(n + 1);
        }
    }



