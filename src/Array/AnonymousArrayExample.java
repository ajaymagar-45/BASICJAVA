package Array;

public class AnonymousArrayExample {

    // Method that accepts an array
    static int sum(int[] arr) {
        int total = 0;

        for (int x : arr) {
            total += x;
        }
        return total;
    }

    public static void main(String[] args) {


//         Passing an anonymous array directly
        int result = sum(new int[]{10, 20, 30, 40});

        System.out.println("Sum = " + result);
        int a[]={10,20,30};
        int b[]=new int[a.length];
        int c[]=a.clone();
        System.out.println(c[0]);
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.println(b[i]);
        }


    }
}
