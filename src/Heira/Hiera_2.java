package Heira;
class Vehicle_1 {
    void move() { System.out.println("Vehicle moves"); }
}
class Car extends Vehicle_1 {
    void drive() { System.out.println("Car drives"); }
}
class Bike extends Vehicle_1 {
    void ride() { System.out.println("Bike rides"); }
}


public class Hiera_2 {
    public static void main(String[] args) {
        Bike obj=new Bike();
        obj.ride();
        obj.move();

        Car obj1=new Car();
        obj1.drive();

    }

}
