import java.util.Scanner;
public class AnonymousArray {


        // Method that receives anonymous array
        static void printArray(int[] arr) {
            System.out.println("Elements of the array:");
            for(int i=0;i< arr.length;i++){
                System.out.println(arr[i]);
            }
        }


        public static void main(String[] args) {


            // Passing an anonymous array to the method
//            printArray(new int[] {10, 20, 30, 40, 50});
//            System.out.println("*****************");
//            int[] a = {10, 20, 30};
//            int[] b = a.clone();
//            for(int i=0;i< a.length;i++){
//                System.out.println(b[i]);
//            }
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your Name : ");
            String name=sc.nextLine();

            System.out.println(name);
            System.out.println("Enter Your age : ");
            int age=sc.nextInt();






        }
    }


