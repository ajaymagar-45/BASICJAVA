package Constructor;





public class This {

    This(){
     ////call same class 2-arg constructor
        this(100,"Java Program");
        System.out.println("no-arg constructor");

    }

    This(int age, String name){
        System.out.println("2-arg constructor");
    }


    This(int age, String name, boolean t){
        this(); //call same class no-arg constructor
        //super();
        System.out.println("3-arg constructor");
    }

    public static void main(String[] args) {
        This obj = new This(100, "Java", true);

        /*IntroToThisKeyword obj1 = new IntroToThisKeyword(100, "Java");

        IntroToThisKeyword obj3 = new IntroToThisKeyword();*/
    }

}

