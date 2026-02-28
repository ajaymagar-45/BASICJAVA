package Inheritance;

import java.util.*;

class main  {
      enum Day {
          SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
      }


      int num = 500000;

    void test() {
        System.out.println(" INHERITANCE");
    }

    void ok() {
        System.out.println("hello world");
    }

      public static void main(String[] args) {
          main obj=new main();
          obj.test();
      }
}

public class  inher extends main {
      void a(){
          System.out.println("inheritance");
      }


    public static void main(String[] args) {




        inher obj1 = new inher();

//        System.out.println("given value is " + obj1.num);
//        obj1.test();
//        obj1.num = 4;
//        System.out.println("given value is " + obj1.num);
//        obj1.ok();
//       Day today=Day.FRIDAY;
//        System.out.println(today);
//        enum A{
//            show,test,ok
//        }
//        A a=A.show;
//
//        System.out.println(a);
        Map m=new HashMap();
        m.put(101,"a");
        m.put(101,"b");
        System.out.println(m);
        m.get(101);
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ajay", 22);
        map.put("Rahul", 25);

        Integer age = map.get("Ajay");
        System.out.println(age);   // 22

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        NavigableMap<Integer, String> map1 = new TreeMap<>();

        map1.put(10, "A");
        map1.put(20, "B");
        map1.put(30, "C");

        System.out.println("Lower than 20: " + map1.lowerKey(20));
        System.out.println("Higher than 20: " + map1.higherKey(20));
        System.out.println("Ceiling of 25: " + map1.ceilingKey(25));
        System.out.println("Floor of 25: " + map1.floorKey(25));

        

    }
}
