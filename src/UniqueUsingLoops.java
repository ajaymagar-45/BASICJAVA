import java.util.Arrays;

public class UniqueUsingLoops {

    public static void main(String[] args){
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {4, 5, 6, 7};
        int arr3[] = {9, 10, 11, 12};

        // Combine arrays
        int combined[] = new int[arr1.length + arr2.length + arr3.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) combined[index++] = arr1[i];
        for (int i = 0; i < arr2.length; i++) combined[index++] = arr2[i];
        for (int i = 0; i < arr3.length; i++) combined[index++] = arr3[i];

        // Temp array for unique results
        int unique[] = new int[combined.length];
        int uniqueCount = 0;

        // Main logic with nested loops
        for (int i = 0; i < combined.length; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (combined[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[uniqueCount++] = combined[i];
            }
        }

        // Print unique elements
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
