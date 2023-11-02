package m9.hashmap;

import m9.MyMap;


public class MyHashMapTest {
    public static void main(String[] args) {
        MyMap<String, Integer> myMap = new MyHashMap<>(5);
        MyMap<Integer, String> myMap2 = new MyHashMap<>(20);

        for (int i = 0; i < 20; i++) {
         myMap.put("S" + i, i);
        }
        for (int i = 0; i < 20; i++) {
         myMap2.put(i, "S" + i);
        }

        System.out.println("\n Map with buckets size 5 and 20:");
        System.out.println("myMap = " + myMap);
        System.out.println("myMap.size() = " + myMap.size());
        System.out.println("myMap2 = " + myMap2);
        System.out.println("myMap2.size() = " + myMap2.size());

        System.out.println("\n Get Entry S10 and 10:");
        System.out.println("myMap.get(\"S10\") = " + myMap.get("S10"));
        System.out.println("myMap2.get(10) = " + myMap2.get(10));
        System.out.println("myMap.get(\"S4\") = " + myMap.get("S4"));
        System.out.println("myMap2.get(4) = " + myMap2.get(4));

        // change value
        System.out.println("\n Change/replace value while adding an entry:");
        System.out.println("myMap.put(\"S10\", 11111) = " + myMap.put("S10", 11111));
        System.out.println("myMap.get(\"S10\") = " + myMap.get("S10"));
        System.out.println("myMap2.put(10, \"S11111\") = " + myMap2.put(10, "S11111"));
        System.out.println("myMap2.get(10) = " + myMap2.get(10));

        System.out.println("\n Remove some entries:");
        System.out.println("myMap.remove(\"S1\") = " + myMap.remove("S1"));
        System.out.println("myMap2.remove(16) = " + myMap2.remove(16));
        System.out.println("myMap.remove(\"S5\") = " + myMap.remove("S5"));
        System.out.println("myMap2.remove(5) = " + myMap2.remove(5));
        System.out.println("myMap = " + myMap);
        System.out.println("myMap.size() = " + myMap.size());
        System.out.println("myMap2 = " + myMap2);
        System.out.println("myMap2.size() = " + myMap2.size());

        System.out.println("\n Clear all buckets:");
        System.out.println("myMap.clear() = " + myMap.clear());
        System.out.println("myMap2.clear() = " + myMap2.clear());
        System.out.println("myMap = " + myMap);
        System.out.println("myMap.size() = " + myMap.size());
        System.out.println("myMap2 = " + myMap2);
        System.out.println("myMap2.size() = " + myMap2.size());

    }
}
