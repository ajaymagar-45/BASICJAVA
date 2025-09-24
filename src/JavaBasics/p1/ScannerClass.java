package JavaBasics.p1;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name :");
        String name =sc.next();
        System.out.println("Enteer Your Roll Number :");
        int rollNo=sc.nextInt();

//        System.out.println("Roll No :" + rollNo);vhvhvmmgfk
        System.out.print("Enter your marks :");

        float marks=sc.nextFloat();
        System.out.println("Enter the Coun Student :");
        int studentCount=sc.nextInt();
        System.out.print(" Name : "+name + " Roll No : " + rollNo +" Marks : "+marks + " Total Number of Student present in cass : " + studentCount);


//        System.out.print("Hello : "+name);
    }
}
