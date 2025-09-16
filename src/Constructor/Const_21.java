package Constructor;
class bb {

    bb(int age) {
        this();
        System.out.println(age);
    }


    bb() {

        System.out.println("hello");
    }
}

public class Const_21 extends bb {
   Const_21(){
//      super(22);
        System.out.println("Constructor");
    }
   public static void main(String[] args){
   Const_21 obj=new Const_21();
bb obj1=new bb();



    }

}


