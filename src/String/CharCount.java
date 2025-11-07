package String;

public class CharCount {
    public static void main(String[] args) {
        String str = "hello";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            unique += c;
        }


        for (int i = 0; i < unique.length(); i++) {
            String ch = String.valueOf(unique.charAt(i));
            int count = str.length() - str.replace(ch, "").length();
            System.out.println(ch  + count);
        }

    }
}
