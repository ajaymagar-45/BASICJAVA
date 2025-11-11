public class ReverseGivenNumber {
    public static void main(String[] args) {
        String str="34786";
        char arr[]=str.toCharArray();
        String s1="";
        for (int i=arr.length-1;i>=0;i--){
            s1+=arr[i];
        }
        System.out.println(s1);
    }
}
