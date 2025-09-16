package Multi;


//
class Rainbow {
    void A() {
        System.out.println("Rainbow ");
    }
}


class Red extends Rainbow {
    void B() {
        System.out.println("Red");
    }
}

class Orange_1 extends Red {
    void C() {
        System.out.println("Orange");
    }
}

public class Multilevel_8 {
    public static void main(String[] args) {
        Orange_1 mgr = new Orange_1();
        mgr.A();
        mgr.B();
        mgr.C();
    }
}
