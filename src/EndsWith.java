public class EndsWith {
    public static void main(String[] args) {
        String s1="capital";
        String s2="capitals";
        String end="s";
        boolean b1=s1.endsWith(end);
        boolean b2=s2.endsWith(end);
        System.out.println("This is given string : " + b1);
        System.out.println("This is given string : " + b2);
        System.out.println(s2.contains(end));

    }
}
