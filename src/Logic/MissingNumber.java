package Logic;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,10};
        int n=10;
        int sum = n*(n+1)/2;
        for(int x:a) sum -= x;
        System.out.println("Missing="+sum);

    }
}
