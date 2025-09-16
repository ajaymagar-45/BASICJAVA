package JavaBasics;

public class Method7 {

    int nmk(int t,int v,int o){
        return t+v-o;

    }
    void tyg(){
        System.out.println("not print anything");
    }
    void yui (char l,int t, float f){
        System.out.println(l+ " " + t +" " + f);

    }
    void  gkl(int u,char e,int t,boolean p){
        System.out.println(u +" " + e + " " + t + " " + p );

    }
    void dummyMethod(int a, String name){
        System.out.println("learning "+name);
    }
    public static void main(String[] args){
        Method7 obj1=new Method7();

        System.out.println(obj1.nmk(10, 4, 3));
        obj1.tyg();
        obj1.yui('j',897,8.8f);
        obj1.gkl( 67,'l',678,true);
        obj1.dummyMethod(30,"object");

    }

}
