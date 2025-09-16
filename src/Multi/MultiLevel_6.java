package Multi;



class Vehicle {
    void A(){
        System.out.println("All Vehicles");

    }


}


class Fourwheeler extends Vehicle{
    void B() {
        System.out.println("Twowheeler vehicle");

    }
}

class Twowheeler extends Fourwheeler {


}

public class MultiLevel_6 {
    public static void main(String[] args) {
        Twowheeler obj=new Twowheeler();
        obj.A();
        obj.B();

       
    }
}

