public class Array_0 {
    public static void main(String[] args) {
        int [][] arr={{10,20,30},{1,2,3},{100,200,300}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);

            }
        }
        System.out.println(arr[0][1]);
        System.out.println(arr[1][2]);
    }
}
