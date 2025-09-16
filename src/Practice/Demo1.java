package Practice;


public class Demo1 {
    public static void main(String[] args) {
        int n = 10; // range

        for (int i = 1, j = n; i <= j; i++, j--) {
            if (i == j) {

                System.out.println(i);
            } else {
                System.out.println("Increasing: " + i + ", Decreasing: " + j);
            }
        }
    }
}

