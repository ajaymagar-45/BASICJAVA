package List;

import java.util.ArrayList;
import java.util.List;

public class L1 {
    public static void main(String [] args){
        List<String> f=new ArrayList<>();
        f.add("Hello");
        f.add("World");
        f.add("Java ");
        f.add("Programming");
        System.out.println(f.get(1));
        System.out.println("   ");
        for(String name:f){
            System.out.println(name);
        }
        System.out.println("    ");
        List<Integer> ele=new ArrayList<>();
        ele.add(10);
        ele.add(20);
        ele.add(30);
        System.out.println(ele);
        System.out.println(ele.get(2));
        System.out.println("   ");
    }
}
