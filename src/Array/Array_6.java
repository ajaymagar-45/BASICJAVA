package Array;

public class Array_6 {
    public static void main(String[] args) {
        int arr [] []=new int [3][4];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[0][3]=4;
        arr[1][0]=5;
        arr[1][1]=6;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] );
                System.out.print(" " );
            }
            System.out.println();
        }













//        int aar1[][]={{10,20,30},
//                {40,50}  };
//
//        System.out.println(arr[1][1]);
//        System.out.println(aar1[0][2]);
//
//        for(int i=0;i<aar1.length;i++){
//            for (int j=0;j<aar1[i].length;j++){
//                System.out.print(aar1[i][j]);
//                System.out.print( " ");
//            }
//            System.out.println(" ");
//
//        }
    }
}
