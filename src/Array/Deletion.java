package Array;

public class Deletion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int index=1;

        int newArra[]=new int[arr.length-1];
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(i==index){
                continue;
            }
            newArra[j]=arr[i];
            j++;


        }


        for (int no:newArra){
            System.out.println(no);
        }
    }
}
