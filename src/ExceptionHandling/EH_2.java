package ExceptionHandling;

public class EH_2 {
    void add(int a,int b){
        System.out.println(a/b);
        if(a==0)
            throw new ArithmeticException("a must be greater than 0");
        if(a<0)
            throw new ArithmeticException("a must be positve number");
    }

    void div(int c,int d) throws RuntimeException{
        System.out.println(c/d);
    }
    public static void main(String[] args) {
        EH_2 obj=new EH_2();
        obj.add(-11,5);
        obj.div(10,0);

    }
}
