package Method;

class Addition
{int aa;
    Addition(int aa){
        this.aa=aa;
    }
    int a = 10;
    int b = 20;
    
   void add()
    {

        System.out.println(a + b);
    }
    class Sub extends Addition{

 public Sub(int aa){
          super(aa);

       }


    }
    public static void main(String[] args)
    {
        Addition a = new Addition(9);
        a.add();
        System.out.println("This is veriable from Methods.Method Methods.Addition " +a.a  );
        System.out.println("This is anoher veriable from Methods.Method Addtion "+a.b);
        System.out.println(a.a + a.b);
    }
}