package Array;

public class ShalloeDeepCopyOfArrays {

        public static void main(String[] args) {

            int[] a = {1, 2, 3};

            // ---- SHALLOW COPY ----
            int[] b = a;   // same array

            b[0] = 100;

            System.out.println("After shallow copy:");
            System.out.println("a[0] = " + a[0]); // 100
            System.out.println("b[0] = " + b[0]); // 100


            // ---- DEEP COPY ----
            int[] c = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                c[i] = a[i];   // copying values
            }

            c[1] = 200;

            System.out.println("\nAfter deep copy:");
            System.out.println("a[1] = " + a[1]); // still 2
            System.out.println("c[1] = " + c[1]); // 200
        }


}
