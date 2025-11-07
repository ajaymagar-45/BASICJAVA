class op{
    void a1(){
        System.out.println("Parent class Method");
    }
    static void d(){
        System.out.println("kfn");
    }
}

public class UpcastingAndDowncasting extends op{
    void a1(){
        System.out.println("Child class Method");
    }
    static void d(){
        System.out.println("d");
    }
void fg(){}
    public static void main(String[] args) {
        op o=new UpcastingAndDowncasting();
        UpcastingAndDowncasting d=(UpcastingAndDowncasting) o;



        d.fg();
    }
}
