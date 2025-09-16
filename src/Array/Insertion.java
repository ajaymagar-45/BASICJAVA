package Array;

public class Insertion {
    public static void main(String[] args) {

        int [] arr={10,20,30,40,50};
        int indexpos=2;
        int element=100;
        int [] newArr=new int[arr.length+1];

        for(int i=0;i<indexpos;i++) {
            newArr[i] = arr[i];

        }
        newArr[indexpos]=element;
        for(int i=indexpos;i<arr.length;i++){
            newArr[i+1]=arr[i];
            //from array index 2 all the remaining values of first array will be printed
        }
       for(int no:newArr){
            System.out.print(" "+ no);
        }

    }
}

