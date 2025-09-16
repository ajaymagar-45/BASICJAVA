package Multi;


    class GreatGrandParent {
        void test(){}
    }

    class Parent1 extends GrandParent{
        void dummy(){} //3   4
    }

    class Children extends Parent1 {
        void add(){}
    }

    class GrandParent extends GreatGrandParent {
        void show(){
            System.out.println("j");
        }  //2
        void multi(){}
    }

    public class MultiLevel_2 {
        public static void main(String[] args) {
            Children children = new Children();
            children.add();
            children.test();
            children.show();
            children.dummy();

            Parent1 parent1 = new Parent1();
            parent1.test();
            parent1.multi();
            parent1.dummy();
            parent1.show();


           GrandParent obj= new GrandParent();
           obj.test();
           obj.show();
           obj.multi();

        }
    }

