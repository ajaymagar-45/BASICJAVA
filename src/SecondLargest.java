public class SecondLargest {
    public static void main(String[] args) {

        int arr[]={10,20,30,40, 50, 50};

        int max=-1;
        int secondMax=-1;

        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j<=arr.length-1;j++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[j]!=max && arr[j] > secondMax){
                    secondMax=arr[i];
                }

            }


        }
        System.out.println(max);
        System.out.println(secondMax);

    }
}
