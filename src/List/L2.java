package List;

import java.util.ArrayList;
import java.util.List;

public class L2 {
    public static void main(String[] args) {
//        List<String> f=new ArrayList<>();
//        f.add("Hello");
//        f.add("World");
//        f.add("Java ");
//        f.add("Programming");
//        System.out.println(f.get(1));
//        System.out.println("   ");
//        for(String name:f){
//            System.out.println(name);
//        }
//        System.out.println("    ");
//        List<Integer> ele=new ArrayList<>();
//        ele.add(10);
//        ele.add(20);
//        ele.add(0,30);
//        System.out.println(ele);
//        System.out.println(ele.get(2));
//        System.out.println("   ");
//        ele.remove(0);
//        System.out.println(ele);
        //________________________________________________-
        List<String>Fru=new ArrayList<>();
        Fru.add("Apple");
        Fru.add("Banana");
        Fru.add("Orange");
        Fru.add("Cherry");
        System.out.println(Fru);
        Fru.remove("Apple");
        System.out.println(Fru);
        System.out.println("   ");
        //

        List<Integer>L1=new ArrayList<>();
        L1.add(10);
        L1.add(20);
        L1.add(30);
        L1.add(40);
        L1.add(50);
        L1.add(60);
        System.out.println(L1);
        L1.remove(Integer.valueOf(10));
        System.out.println(L1);





    }
}
