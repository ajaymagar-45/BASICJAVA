package JavaBasics;
public class problem_4 {
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 1;

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            // One real repeated root
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are " + realPart + " + " + imaginaryPart + "i and "
                    + realPart + " - " + imaginaryPart + "i");
        }
    }
}
