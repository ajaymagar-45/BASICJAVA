package Array;

public class Array_4 {
    public static void main(String[] args) {
        int []arr=new int[10];
        int []arr1={11,12,13,14,15};

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        arr[6]=7;
        arr[7]=8;
        arr[8]=9;
        arr[9]=10;
        System.out.println(arr.length);

        for(int no:arr){
            System.out.println(no);

        }
        System.out.println(" ");
        for(int k:arr1){
            System.out.println(k);

        }

    }
}
