package Heira;


class Building {
    void show(){
        System.out.println("Main Buildind");

    }
}

class Block1 extends Building {
 void A(){
     System.out.println("Block 1");
 }




}

class Block2 extends Building {
    void B(){
        System.out.println("Block 2");
    }

}

class Block3 extends Building {
    void C(){
        System.out.println("Block C");
    }
}

public class Hiera_1 {
    public static void main(String[] args) {
        Block3 obj=new Block3();
        obj.show();

        Block1 obj1=new Block1();
        obj1.A();

        Block2 obj2=new Block2();
        obj2.B();

        Block3 obj3=new Block3();
        obj3.C();





    }
}
