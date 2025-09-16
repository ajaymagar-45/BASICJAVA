package Array;

public class Searching {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int element=40;

        for(int i=0;i< arr.length;i++) {
            if (element == arr[i]) {
                System.out.println("element found at given position");
            }
        }
    }
}
