package Logic;


import java.util.StringTokenizer;

public class AvgOfN {
    public static void main(String[] args) {
//        double arr[] = {10, 20, 38, 93, 8, 58, 44, 64, 93, 278};
//        double Avg = 0;
//        for (int i = 0; i < arr.length; i++) {
//            Avg += arr[i];
//        }
//        System.out.println(Avg / arr.length);
//
        byte ascii[] = { 71, 70, 71 };

        // Creating String using byte array
        String firstString = new String(ascii);
        System.out.println(firstString);

        // Creating String using byte array with  Start index to End Index
        String secondString = new String(ascii,1, 2);
        System.out.println(secondString);



}}
