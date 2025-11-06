public class Ignore {
    public static void main(String[] args) {
        String s1="AJAY";
        String s2="ajay";
        String s3="ajay";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s2));
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Given strings are equal in case ignore");
        }
        else{
            System.out.println("Given strings are not equal");
        }
        System.out.println(s1.charAt(0));
        System.out.println(s3.contentEquals(s2));
        System.out.println(s3.contentEquals(s1));
    }
}
