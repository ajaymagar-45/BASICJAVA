package JavaBasics.p2;

public class Basic {
    int a;
    void jf(int aa){
      a=aa;
    }
    public static void main(String[] args) {
//
        Basic obj = new Basic();

        obj.jf(50);
        System.out.println(obj.a);
    }
}
