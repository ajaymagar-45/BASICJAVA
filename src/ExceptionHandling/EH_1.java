package ExceptionHandling;

public class EH_1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            System.out.println(10/0);
        }
        catch (Exception e) {

//            System.out.println(10/2);
            e.printStackTrace();
        }

        System.out.println("World");
    }
}
