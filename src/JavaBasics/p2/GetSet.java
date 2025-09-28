package JavaBasics.p2;
class A{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;
    }



}

public class GetSet  {
    public static void main(String[] args) {
       A o=new A();
        o.setName("Ajay");
        o.setAge(22);

        System.out.println(o.getName());
        System.out.println(o.getAge());
    }



}
