package Abstraction;
 abstract class a{



    abstract void ac();//Abstract method
     a(){
         System.out.println("123");
     }

}
  class bb extends a {
  @Override
    void ac(){
        System.out.println("abstraction");
    }


//Added new commit



    public static void main(String[] args) {
        bb o=new bb();
        o.ac();




    }
}
