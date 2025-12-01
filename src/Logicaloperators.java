public class Logicaloperators {

        public static void main(String[] args) {

            int a = 10;
            int b = 20;
            int c = 10;



            // Logical AND
            System.out.println("\nLogical AND (&&):");
            System.out.println("(a == c) && (b > a) : " + ((a == c) && (b > a)));  // true && true = true

            // Logical OR (||)
            System.out.println("\nLogical OR (||):");
            System.out.println("(a > b) || (b > a) : " + ((a > b) || (b > a)));   // false || true = true

            // Logical NOT (!)
            System.out.println("\nLogical NOT (!):");
            boolean result = a == b;  // false
            System.out.println("!(a == b) : " + !(a == b));  // !false = true

            // Combined logical operations
            System.out.println("\nCombined operators:");
            System.out.println("((a < b) && (a == c)) || (b < c) : "
                    + (((a < b) && (a == c)) || (b < c)));
        }
    }


