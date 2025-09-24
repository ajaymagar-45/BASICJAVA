package JavaBasics.p1;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name :");
        String name =sc.next();
        System.out.println("Enteer Your Roll Number :");
        int rollNo=sc.nextInt();

//        System.out.println("Roll No :" + rollNo);
        System.out.print("Enter your marks :");
        float marks=sc.nextFloat();
        System.out.print(" Name : "+name + " Roll No : " + rollNo +" Marks : "+marks);

//        System.out.print("Hello : "+name);
    }
}
