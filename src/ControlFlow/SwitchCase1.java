package ControlFlow;

public class SwitchCase1 {
    public static void main(String[] args) {
        int day=1;
        String dayname;
        switch (day){
            case 1:
                dayname="Sunday";
                break;
            case 2:
                dayname="Monady";
                break;
            case 3:
                dayname="Tuesday";
                break;
           default:
                dayname="Invalid Input";

        }
        System.out.println("Today is "+ dayname);
    }
}
