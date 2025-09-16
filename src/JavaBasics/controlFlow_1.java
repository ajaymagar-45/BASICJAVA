package JavaBasics;

public class controlFlow_1 {
    public static void main(String[] arg){
        int a=100;
        int b=200;
        if(a%2==0){
            System.out.println("a is even");

        }
        if(a<b){
            System.out.println("a is smaller than b\n") ;
            int temp=36;
            if(temp<=26){
                System.out.println("Weather must be cloudy\n");
            }
            else{
                System.out.println("probably it is sunny\n");
            }
            int c=80;
            if(c>35){
                System.out.println("Student is pass");
            }
            else
            {
                System.out.println("Student is failed in the exam");
            if(c>=75){
                System.out.println("Student is pass with distinction marks");
            }
            if(c>=95){
                System.out.println("Student got A grade");
            }
            if(c>=80 && c<=94){
                System.out.println("Student got B grade");
            }
            if(c>=70 && c<=79){
                System.out.println("Student got C grade");
            }

            }


        }
    }
}
