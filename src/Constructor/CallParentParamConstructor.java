package Constructor;



class Parentt{
     Parentt(){
        System.out.println("Parent class no-arg constructor ");
    }

    Parentt(String name, int age){
        System.out.println("Parent class 2 Params constructor ");
    }

    Parentt(int age){
        System.out.println("Parent class 1 Params constructor ");
    }
}

public class CallParentParamConstructor extends Parentt{

    CallParentParamConstructor(){
        super(100); //it won't call no-arg
        System.out.println("Child class Constructor ");
    }

    CallParentParamConstructor(int number){
        //super("Java", 100);
        super("Java",100); //it won't call no-arg
        // super();
        System.out.println("Child class 1 Params Constructor ");
    }

    public static void main(String[] args) {
       CallParentParamConstructor child = new CallParentParamConstructor(100);
        System.out.println("==========");
        CallParentParamConstructor child1 = new CallParentParamConstructor();
    }
}

