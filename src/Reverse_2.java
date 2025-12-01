public class Reverse_2 {
    public static void main(String[] args) {
        String a="Ajay";
        char [ ] kl=a.toCharArray();
        System.out.println(kl);
      String er= "";
      for(int i=kl.length -1;i>=0;i--) {
          er += kl[i];
      }
        System.out.println(er);
    }
}
