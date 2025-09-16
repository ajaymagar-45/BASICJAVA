package Heira;

class WhatsApp {

    void A() { System.out.println("Mobile Application"); }
}
class Message extends WhatsApp {

    void B() { System.out.println("used for Messsage"); }
}
class call extends WhatsApp{

    void C(){
        System.out.println("used for calling");
    }

}




public class Hiera_6 {
    public static void main(String[] args) {
        call obj=new call();
        obj.A();
        obj.C();

        Message obj1=new Message();
        obj1.A();
        obj1.B();

    }
}



