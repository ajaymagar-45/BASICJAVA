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

        }
        System.out.println(" **************");
        int inc=1;
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +inc);
                inc++;
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
