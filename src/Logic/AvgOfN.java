package Logic;

public class AvgOfN {
    public static void main(String[] args) {
        double arr []={10,20,38,93,8,58,44,64,93,278};
        double Avg=0;
        for(int i=0;i< arr.length;i++){
            Avg+=arr[i];
        }
        System.out.println(Avg/ arr.length);
    }
}
