package Array;

public class MerageTwoArrayIntoOne {
    public static void main(String[] args) {
        int arr1[]={10,20,30,40};
        int arr2[]={50,60,70,80};
        int newArr[]=new int[arr2.length+arr1.length];
//      in this for loop we are puting the values of aar1 into  the new array in their respective index at new array
        for (int i=0;i<arr1.length;i++) {
            newArr[i]=arr1[i];
        }
        //in this at athe index 4 we are inserting elements of arr2 in the new array
        for (int i=0;i<arr2.length;i++) {
            newArr[arr1.length+i]=arr2[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + " ");
        }

    }
}
