package Multi;


class India {
    void A(){
        System.out.println("India");

    }


}


class Maharashtra extends India {
    void B() {
        System.out.println("Maharastra");

    }
}

class mumbai extends Maharashtra {



}











public class MultiLevel_7 {
    public static void main(String[] args) {


    mumbai obj = new mumbai();


        obj.A();
        obj.B();

}
}
