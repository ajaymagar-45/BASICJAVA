package Multi;

class Apple {
    void A() {
        System.out.println("Apple");


    }
}

class Banana extends Apple {
    void B() {
        System.out.println("Banana");
    }
}

class Orange extends Banana {
    void C() {
        System.out.println("Orange");
    }
}

public class MultiLevel_9 {
    public static void main(String[] args) {
        Orange obj = new Orange();

        obj.A();
        obj.B();
        obj.C();
    }
}

