public class ConditionalOperator {


        public static void main(String[] args) {

            int a = 10;
            int b = 20;


            String g = (a > b) ? "a is greater" : "b is greater";
            System.out.println(g);


            int num = 7;
            String result2 = (num % 2 == 0) ? "Even" : "Odd";
            System.out.println("Number " + num + " is: " + result2);


            int age = 16;
            String result3 = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
            System.out.println(result3);


            
        }
    }


