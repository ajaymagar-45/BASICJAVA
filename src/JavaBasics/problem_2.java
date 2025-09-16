package JavaBasics;
public class problem_2 {
    public static void main(String[] args) {

        double number = 25;

        System.out.println("Input value: " + number);

        if (number == 0) {
            System.out.println("Zero");
        } else {

            if (number > 0) {
                System.out.print("Positive number");
            } else {
                System.out.print("Negative number");
            }


            if (Math.abs(number) < 1) {
                System.out.println(" (small)");
            } else if (Math.abs(number) > 1000000) {
                System.out.println(" (large)");
            } else {
                System.out.println();
            }
        }
    }
}
