package Array;

public class JaggedArray {
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        arr[0]=new int [3];
        arr[1]=new int[2];
        arr[2]=new int[4];
        arr[0][0]=11;
        for (int n[]:arr){
            for (int m:n){
                System.out.print(m);
                System.out.print( " ");
            }
            System.out.println();
        }
    }
}
