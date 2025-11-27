package Encapsulation;
class A {
    private int age;
    private String name;

    public void setAge(int age){
        this.age=age;

    }
    public int getAge( ){

return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){

        return name;
    }

}

public class Encap_1 {
    public static void main(String[] args) {
        A obj=new A();
        obj.setAge(22);
        obj.setName("Ajay");
        System.out.println(obj.getAge() +  " "+ obj.getName());
    }

}
