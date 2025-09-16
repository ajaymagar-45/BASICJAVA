package JavaBasics.p2;

import JavaBasics.p1.First;

public class Second extends First{
    public void exm1(){
        System.out.println("Child class First Method");
    }
    protected void exm2(){
        System.out.println("Child class Second Method");
    }

    public static void main(String[] args) {
        Second obj1=new Second();
        obj1.exm1();
        obj1.exm2();

    }
}
