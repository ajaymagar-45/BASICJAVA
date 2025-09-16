package JavaBasics;

public class switch3 {
    public static void main(String [] arg){
        int city=7;
        String cityname ;

        switch(city) {

            case 1:
                cityname = "pune";
                break;
            case 2:
                cityname = "latur";
                break;
            case 3:
                cityname="mumbai";
                break;
            case 4:
                cityname="nagpur";
                break;
            case 5:
                cityname="kolhapur";
                break;
            case 6:
                cityname="nashik";
                break;
            case 7:
                cityname="solapur";
                break;
            case 8:
                cityname="sangali";
                break;
            case 9:
                cityname="kallamb";
                break;

            default:
                cityname="not mentioned";


        }




            System.out.println("This is " +  cityname +" city");


    }

    }

