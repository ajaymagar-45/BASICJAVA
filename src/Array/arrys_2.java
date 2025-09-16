package Array;

public class arrys_2 {
    public static void main(String[] args) {



            int[] roll_no = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            for (int i = 0; i < roll_no.length; i++) {
                System.out.println(roll_no[i]);


            }
        System.out.println(   );

            int temp=0;
            temp=roll_no[0];
            roll_no[0]=roll_no[1];
            roll_no[1]=temp;
        for (int i = 0; i < roll_no.length; i++) {
            System.out.println(roll_no[i]);

        }


            System.out.println("\n");
        }
    }
