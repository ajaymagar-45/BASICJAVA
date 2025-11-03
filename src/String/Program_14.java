package String;

public class Program_14 {
    public static void main(String[] args) {
        String s = "apple,banana,grapes";
        String[] fruits = s.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
