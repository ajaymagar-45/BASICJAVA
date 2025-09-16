package Constructor;

class const_2{

    const_2(){
        System.out.println("const_2");
    }

}


public class Const_1 extends const_2 {

    Const_1(){
        System.out.println("This is Construtor");


    }








    public static void main(String[] args) {
        int arr []={10,20,30};

        Const_1 obj=new Const_1();
       System.out.println(arr[0]);
       


    }


}

