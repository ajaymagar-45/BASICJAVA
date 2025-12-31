import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) {
        String str1="Ajay";
        String str2=new String(" magar");
        System.out.println(str1.concat(str2));
//        System.out.println(str1.contains("Ajay"));
        StringBuffer sb=new StringBuffer(100);
//        System.out.println(sb);
        StringBuilder sb1=new StringBuilder("Printing ");
//        System.out.println(sb1);
        StringTokenizer st = new StringTokenizer("this is a test");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
