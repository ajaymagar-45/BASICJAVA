package Logic;

public class CountOfGivenNumber {
    public static void main(String[] args) {
        int n = 98765093, count = 0;

        while(n > 0){
            count++;
            n /= 10;

        }
        System.out.println(count);

    }

}
