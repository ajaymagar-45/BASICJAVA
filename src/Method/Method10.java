package Method;

public class Method10{
    int uyt (int l, int m,int b){
        return l*m*b;




    }

    void opt (char l, float e,char t, double n){
        System.out.println(l +" " + e + " " + l + " " + n);

    }
    void jds (int l,double c,char n){
        System.out.println(l +" " + c + " " + n);

    }
    void nmk(){
        System.out.println("print nothing");
    }
    //Methods.Method obj=new Methods.Method();
    //obj.abc();

    public static void main(String[] arg) {
        Method10 obj = new Method10();
        System.out.println(obj.uyt(8,68,9));
        obj.opt('u',58.99f,'y',8747878);
        obj.jds(678,8777,'k');
        obj.nmk();

    }

}
