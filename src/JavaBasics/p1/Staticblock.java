package JavaBasics.p1;

public class Staticblock {

    static {
        System.out.println("This is static block");
    }
    {
        System.out.println("Instance block");
    }
    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        Staticblock o=new Staticblock();
        System.out.println("this is main method");
    }
    static{
        System.out.println("Second static block");
    }
}
