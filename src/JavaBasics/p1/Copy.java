package JavaBasics.p1;

public class Copy {
    int  op(int a,int c){
        return 10;}

     char ch(char c){

    return (char)(c+1 );
        }
        char abu(){
            System.out.println("char Method");
        return 'd';
        }



    void mo(int n){
        System.out.println(n*n);
    }
    void add(int a,int b){
        System.out.println( a + b);

    }


    public static void main(String[] args) {
        Copy onj=new Copy();
        onj.op(20,30);
        System.out.println(onj.ch('l' ));
        onj.abu();
//        onj.mo(5);
//       System.out.println(  onj.op(10,29));
//       int sum=onj.op(40,40);
//        System.out.println(sum);
//        onj.add(10,50);


    }
}
