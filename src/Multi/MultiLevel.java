package Multi;


    class GrandFather {
        void aj(){
            System.out.println("Hello World");

        }


    }


    class Father extends GrandFather {
        void nm() {
            System.out.println("hhs");

        }
    }

    class child extends Father {
        void cal(){
            System.out.println("To calculate values");
        }


    }


public class MultiLevel {

    public static void main(String[] args) {


        child obj = new child();

       obj.aj();
        obj.nm();
        obj.cal();


        Father obj1=new Father();
        obj1.aj();
        obj1.nm();

        GrandFather obj2=new GrandFather();
        obj2.aj();





    }
}


