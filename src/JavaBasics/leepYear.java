package JavaBasics;

public class leepYear {
    public static void main(String[] arg){
        int y=2000;
        if(y %4==0){
            System.out.println(y +" is leap year");

        }
        if(y %100 ==0 && y % 400!= 0){
            System.out.println(y +" is not a leap year");
        }
    }
}
