package Practice;
import java.util.*;
public class ShallowCopy {



        public static void main(String[] args) {
            ArrayList<String> list1 = new ArrayList<>();
            list1.add("Apple");
            list1.add("Banana");

            // Shallow copy (copy of reference)
            ArrayList<String> list2 = (ArrayList<String>) list1.clone();

            list2.set(0, "Mango");  // changes only in list2
            list1.add("Orange");    // changes only in list1

            System.out.println("List1: " + list1);
            System.out.println("List2: " + list2);
        }


}
