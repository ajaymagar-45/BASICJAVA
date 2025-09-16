package Multi;
class Shape {
    void A() {
        System.out.println("Shape");

    }
}

class Rectangle extends Shape {
    void B() {
        System.out.println("This is a rectangle.");
    }
}

class Square extends Rectangle {
    void C() {
        System.out.println("This is a Square.");
    }
}

public class MultiLevel_10 {
    public static void main(String[] args) {
        Square obj=new Square();
        obj.A();
        obj.B();
        obj.C();
    }
}



