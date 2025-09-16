package JavaBasics;

class Addition
{
    int a = 10;
    int b = 20;
    
   void add()
    {

        System.out.println(a + b);
    }
    public static void main(String[] args)
    {
        Addition a = new Addition();
        a.add();
        System.out.println("This is veriable from Methods.Method Methods.Addition " +a.a  );
        System.out.println("This is anoher veriable from Methods.Method Addtion "+a.b);
        System.out.println(a.a + a.b);
    }
}