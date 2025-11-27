package String;

public class CountOfSpecificCharacter {

        public static void main(String[] args) {
            String str = "programminglanguage";
            char target = 'a';
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target) {
                    count++;
                }
            }

            System.out.println("Count of '" + target + "' = " + count);
        }


}
