package Method;

public class Method9{
    int ilk (int a, int b){
        return a+b;


    }

    void klo (char a, float g,char l){
        System.out.println(a +" " + g + " " + l);

    }    void fgt (int j,double b,char e){
        System.out.println(j +" " + b + " " + e);

    }
    void nmk(int a){
        System.out.println(a);
    }
    char vtj(char s){
        return s;

    }
    int  abc (int a,int b){
        return a+b;

    }


    public static void main(String[] arg) {
        Method9 obj = new Method9();
        System.out.println(obj.ilk(3,6));
        obj.klo('j',56.98f,'o');
        obj.fgt(98,7777,'y');
        obj.nmk(29);
        System.out.println(obj.vtj('d'));
        System.out.println(obj.abc(89,78));

    }

}