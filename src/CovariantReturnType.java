
class Abc{
    Abc v(){
        System.out.println("Parent class Method");
        return this;

    }


}

public class CovariantReturnType extends Abc{
    CovariantReturnType v(){
        super.v();
        System.out.println("Child class Method");
        return this;
    }

    public static void main(String[] args) {
        CovariantReturnType o=new CovariantReturnType();
        o.v();
        System.out.println('a'+'b');
        System.out.println("a"+'a'+0);


    }

}
