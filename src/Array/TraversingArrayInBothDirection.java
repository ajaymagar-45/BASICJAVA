package Array;

public class TraversingArrayInBothDirection {
    public static void main(String[] args) {
        int arrr[]=new int[10];
        int k=1;int m=10;

        for(int i=0,j=arrr.length-1;i<arrr.length && j>=0; i++,j--){


            System.out.println("Forword Traversing "+ k +arrr[i] + "  Backword Traversing "+ m +arrr[j]);
                        k++;
                        m--;

        }
    }
}
