package JavaBasics;

public class Add {
    public static void main(String[] args) {

        int first = 32;
        int second = 3;

        // add two numbers
        int sum = first / second;
        System.out.println(first + " + " +second + " = "  + sum);
        Add obj=new Add();
        System.out.println(obj.cdh(26,25));
        obj.kli(10,true,'m',109.87f);
        obj.fgh(77.89f,29,'o',8732899,true,false);
        System.out.println(obj.bhi(9,78));

    }
    int cdh(int z,int b){

        return z*b;

    }
    void kli(int i,boolean b,char c,float f){
        System.out.println(i + " " + b +" " +  c + " " + f);
    }
    void fgh(float r, int h,char d,double j,boolean a,boolean b){
        System.out.println(r + " " + h + " " + d +" " +j + " " + a  + " " + b);

    }
    boolean bhi(int a,int b){
        System.out.println(a + " " + b);
        return false;
    }


}






