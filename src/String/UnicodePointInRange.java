package String;

public class UnicodePointInRange {

        public static void main(String[] args) {
            String text = "Ajay";
            int count = text.codePointCount(0, text.length());
            System.out.println("Total Unicode code points: " + count);
        }


}
