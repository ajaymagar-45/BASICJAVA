import java.util.Arrays;

public class ArrayShallowAndDeepCopy {



        public static void main(String[] args) {

            int[] original = {10, 20, 30};

            // ----------- SHALLOW COPY -------------
            int[] shallowCopy = original;   // Both refer to same array

            System.out.println("Before changing shallowCopy:");
            System.out.println("Original     : " + Arrays.toString(original));
            System.out.println("Shallow Copy : " + Arrays.toString(shallowCopy));

            // Change shallowCopy
            shallowCopy[0] = 999;

            System.out.println("\nAfter changing shallowCopy:");
            System.out.println("Original     : " + Arrays.toString(original));
            System.out.println("Shallow Copy : " + Arrays.toString(shallowCopy));



            // ----------- DEEP COPY -------------
            int[] deepCopy = Arrays.copyOf(original, original.length);

            System.out.println("\nBefore changing deepCopy:");
            System.out.println("Original     : " + Arrays.toString(original));
            System.out.println("Deep Copy    : " + Arrays.toString(deepCopy));

            // Change deepCopy
            deepCopy[1] = 888;

            System.out.println("\nAfter changing deepCopy:");
            System.out.println("Original     : " + Arrays.toString(original));
            System.out.println("Deep Copy    : " + Arrays.toString(deepCopy));
        }
    }


