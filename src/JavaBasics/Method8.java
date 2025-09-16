package JavaBasics;

public class Method8{
    char vyu (char a){
        return a;


    }

    void gfd (boolean a, int g,char s){
        System.out.println(a +" " + g + " " + s);

    }
    void hjk (int a,boolean b,char e){
        System.out.println(a +" " + b + " " + e);

    }
    void nmk(){
        System.out.println("print nothing");
    }


    public static void main(String[] arg) {
        Method8 obj = new Method8();
        System.out.println(obj.vyu('d'));
        obj.gfd(true,647,'j');
        obj.hjk(10,true,'d');
        obj.nmk();

    }

}