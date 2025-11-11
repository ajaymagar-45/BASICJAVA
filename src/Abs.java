abstract  class Asd{
   abstract void add();
}

public class Abs {
    static{
        System.out.println("static block");
    }
    void add(){
        int a=10;
        int b=20;
    }
   static void add(int i){
        int c=10;
        int d=20;
       System.out.println(c+d);
    }
    public static void main(String[] args) {

        add(10);
    }
}
