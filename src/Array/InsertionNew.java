package Array;


public class InsertionNew {
    public static void main(String[] args) {


        int arr[] = {10, 20, 30, 40, 50, 60};
        int position = 3;
        int number = 70;
        int newArr[] = new int[arr.length + 1];
        for(int i=0;i<position;i++){
            newArr[i]=arr[i];
        }
        newArr[position]=number;
        for(int i=position ;i< arr.length;i++){
            newArr[i+1]=arr[i];
        }
        for(int no:newArr){
            System.out.println(no);
        }

    }

}
