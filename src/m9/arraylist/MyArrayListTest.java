package m9.arraylist;

import m9.MyList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyList<String> strArrayList = new MyArrayList<>(2);
        MyList<Integer> intArrayList = new MyArrayList<>(2);
        // String
        System.out.println("Create 2 array lists (String & Integer objects) with capacity 2:");
        strArrayList.add("S1");
        strArrayList.add("S2");
        System.out.println("strArrayList = " + strArrayList);
        System.out.println("strArrayList.size() = " + strArrayList.size());
        // Integer
        intArrayList.add(1);
        intArrayList.add(2);
        System.out.println("intArrayList = " + intArrayList);
        System.out.println("intArrayList.size() = " + intArrayList.size());

        // Add new elements to array-list to test expandable
        System.out.println("\nAdd 20 new String elements:");
        for (char i = 65; i <= 85; i++) {
            strArrayList.add(String.valueOf(i).repeat(4));
        }
        System.out.println("strArrayList = " + strArrayList);
        System.out.println("strArrayList.size() = " + strArrayList.size());

        // Add new elements to array-list to test expandable
        System.out.println("\nAdd 20 new Integer elements:");
        for (int i = 8800; i < 8821; i++) {
            intArrayList.add(i);
        }
        System.out.println("intArrayList = " + intArrayList);
        System.out.println("intArrayList.size() = " + intArrayList.size());

        // Get some String elements
        System.out.println("\nGet some String elements:");
        for (int i = 0; i <= 30; i += 7) {
            System.out.printf("strArrayList.get(%d) = %s\n", i, strArrayList.get(i));
        }
        // Get some Integer elements
        System.out.println("\nGet some Integer elements:");
        for (int i = 0; i <= 30; i += 7) {
            System.out.printf("intArrayList.get(%d) = %s\n", i, intArrayList.get(i));
        }

        // Remove some String elements
        System.out.println("\nRemove some String elements:");
        for (int i = 0; i <= 30; i += 7) {
            System.out.printf("strArrayList.remove(%d) = %b\n", i, strArrayList.remove(i));
        }
        System.out.println("strArrayList = " + strArrayList);

        // Remove some Integer elements
        System.out.println("\nRemove some Integer elements:");
        for (int i = 0; i <= 30; i += 7) {
            System.out.printf("intArrayList.remove(%d) = %b\n", i, intArrayList.remove(i));
        }
        System.out.println("intArrayList = " + intArrayList);

        // Clear all elements
        System.out.println("\nClear all collections:");
        strArrayList.clear();
        System.out.println("strArrayList = " + strArrayList);
        System.out.println("strArrayList.size() = " + strArrayList.size());
        intArrayList.clear();
        System.out.println("intArrayList = " + intArrayList);
        System.out.println("intArrayList.size() = " + intArrayList.size());
    }
}
