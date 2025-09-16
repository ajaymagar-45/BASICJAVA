package JavaBasics;
class Demo{
    public void a(){
        System.out.println("Public Method 1");
    }
    public void b(){
        System.out.println("Public Method 2");

    }
    private void c(){
        System.out.println("Private Method ");
    }
    final void d(){
        System.out.println("Final Method ");
    }

    static void e(){
        System.out.println("Static Method ");
    }

}
public class Rule_8 {
   public void a(){
       System.out.println("child class Method 1");

    }
    void d(){
        System.out.println("Redefining final method not overrriding");
    }
    public void b(){
        System.out.println("Child class Method 2");
    }

    public static void main(String[] args) {
       Rule_8 obj=new Rule_8();
       obj.a();
       obj.b();
       obj.d();



    }



}
