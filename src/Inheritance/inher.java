package Inheritance;

  class main  {
      enum Day {
          SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
      }


      int num = 500000;

    void test() {
        System.out.println(" INHERITANCE");
    }

    void ok() {
        System.out.println("hello world");
    }

      public static void main(String[] args) {
          main obj=new main();
          obj.test();
      }
}

public class  inher extends main {
      void a(){
          System.out.println("inheritance");
      }


    public static void main(String[] args) {




        inher obj1 = new inher();

        System.out.println("given value is " + obj1.num);
        obj1.test();
        obj1.num = 4;
        System.out.println("given value is " + obj1.num);
        obj1.ok();
       Day today=Day.FRIDAY;
        System.out.println(today);
        enum A{
            show,test,ok
        }
        A a=A.show;

        System.out.println(a);



    }
}
