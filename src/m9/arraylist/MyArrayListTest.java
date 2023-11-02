package m9.arraylist;

import m9.MyList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyList<Integer> arrayGrowTest = new MyArrayList<>(0);
        System.out.println("\nHow the array-list grows:");
        System.out.println("Add 10000 Integer elements:");
        int sizePoint = -1;
        for (int i = 0; i <= 10000; i ++) {
            arrayGrowTest.add(i);
            if (sizePoint != arrayGrowTest.size()) {
                System.out.printf("Add %d , size %d\n", i, arrayGrowTest.size());
                sizePoint = arrayGrowTest.size();
            }
        }
        System.out.printf("Add %d , size %d\n", 10000, arrayGrowTest.size());

        MyList<String> strArrayList = new MyArrayList<>(2);
        MyList<Integer> intArrayList = new MyArrayList<>(2);

        System.out.println("\nCreate 2 array lists (String & Integer objects) with capacity 2:");
        // String
        System.out.println("\nAdd 2 elements:");
        strArrayList.add("S1");
        strArrayList.add("S2");
        System.out.println("strArrayList = " + strArrayList);
        System.out.println("strArrayList.size() = " + strArrayList.size());
        intArrayList.add(1);
        intArrayList.add(2);
        System.out.println("intArrayList = " + intArrayList);
        System.out.println("intArrayList.size() = " + intArrayList.size());

        // Add new elements to array-list to test grow
        System.out.println("\nAdd 20 elements:");
        for (char i = 65; i <= 85; i++) {
            strArrayList.add(String.valueOf(i).repeat(4));
        }
        System.out.println("strArrayList = " + strArrayList);
        System.out.println("strArrayList.size() = " + strArrayList.size());

        // Add new elements to array-list to test expandable
        System.out.println("\nAdd 20 Integer elements:");
        for (int i = 8800; i < 8821; i++) {
            intArrayList.add(i);
        }
        System.out.println("intArrayList = " + intArrayList);
        System.out.println("intArrayList.size() = " + intArrayList.size());

        // Get some String elements
        System.out.println("\nGet some String elements:");
        for (int i = 0; i <= 30; i += 5) {
            System.out.printf("strArrayList.get(%d) = %s\n", i, strArrayList.get(i));
        }

        // Get some Integer elements
        System.out.println("\nGet some Integer elements:");
        for (int i = 0; i <= 32; i += 5) {
            System.out.printf("intArrayList.get(%d) = %s\n", i, intArrayList.get(i));
        }

        // Remove some String elements
        System.out.println("\nRemove some String elements:");
        for (int i = 0; i <= 32; i += 5) {
            System.out.printf("strArrayList.remove(%d) = %b\n", i, strArrayList.remove(i));
        }
        System.out.println("strArrayList = " + strArrayList);

        // Remove some Integer elements
        System.out.println("\nRemove some Integer elements:");
        for (int i = 0; i <= 30; i += 5) {
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
