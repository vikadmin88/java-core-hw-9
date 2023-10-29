package m9.linkedlist;

import m9.MyList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyList<String> strMyLinkedList = new MyLinkedList<>();
        MyList<Integer> intMyLinkedList = new MyLinkedList<>();

        System.out.println("Created 2 lists: strMyLinkedList, intMyLinkedList");
        System.out.printf("strMyLinkedList = %s Size: %d\n", strMyLinkedList, strMyLinkedList.size());
        System.out.printf("intMyLinkedList = %s Size: %d\n", intMyLinkedList, intMyLinkedList.size());
        System.out.println();
        System.out.println("Add 6 String nodes: S111...S666:");
        strMyLinkedList.add("S111");
        strMyLinkedList.add("S222");
        strMyLinkedList.add("S333");
        strMyLinkedList.add("S444");
        strMyLinkedList.add("S555");
        strMyLinkedList.add("S666");
        System.out.printf("strMyLinkedList = %s Size: %d\n", strMyLinkedList, strMyLinkedList.size());
        System.out.println();
        System.out.println("Add 6 Integer nodes: 1000...6000:");
        intMyLinkedList.add(1000);
        intMyLinkedList.add(2000);
        intMyLinkedList.add(3000);
        intMyLinkedList.add(4000);
        intMyLinkedList.add(5000);
        intMyLinkedList.add(6000);
        System.out.printf("intMyLinkedList = %s Size: %d\n", intMyLinkedList, intMyLinkedList.size());
        System.out.println();
        System.out.println("Get nodes: 0, 3, 5:");
        System.out.println("strMyLinkedList.get(0) = " + strMyLinkedList.get(0));
        System.out.println("strMyLinkedList.get(3) = " + strMyLinkedList.get(3));
        System.out.println("strMyLinkedList.get(5) = " + strMyLinkedList.get(5));
        System.out.println("strMyLinkedList.get(15) = " + strMyLinkedList.get(15));
        System.out.println();
        System.out.println("intMyLinkedList.get(0) = " + intMyLinkedList.get(0));
        System.out.println("intMyLinkedList.get(3) = " + intMyLinkedList.get(3));
        System.out.println("intMyLinkedList.get(5) = " + intMyLinkedList.get(5));
        System.out.println("intMyLinkedList.get(15) = " + intMyLinkedList.get(15));
        System.out.println();
        System.out.println("Remove nodes: 0, 3, 5:");
        System.out.printf("strMyLinkedList.remove(0) = %s %b\n", strMyLinkedList.get(0), strMyLinkedList.remove(0));
        System.out.printf("strMyLinkedList = %s Size: %d\n", strMyLinkedList, strMyLinkedList.size());
        System.out.printf("strMyLinkedList.remove(3) = %s %b\n", strMyLinkedList.get(3), strMyLinkedList.remove(3));
        System.out.printf("strMyLinkedList = %s Size: %d\n", strMyLinkedList, strMyLinkedList.size());
        System.out.printf("strMyLinkedList.remove(5) = %s %b\n", strMyLinkedList.get(5), strMyLinkedList.remove(5));
        System.out.printf("strMyLinkedList = %s Size: %d\n", strMyLinkedList, strMyLinkedList.size());
        System.out.println();
        System.out.printf("intMyLinkedList.remove(0) = %s %b\n", intMyLinkedList.get(0), intMyLinkedList.remove(0));
        System.out.printf("intMyLinkedList = %s Size: %d\n", intMyLinkedList, intMyLinkedList.size());
        System.out.printf("intMyLinkedList.remove(3) = %s %b\n", intMyLinkedList.get(3), intMyLinkedList.remove(3));
        System.out.printf("intMyLinkedList = %s Size: %d\n", intMyLinkedList, intMyLinkedList.size());
        System.out.printf("intMyLinkedList.remove(5) = %s %b\n", intMyLinkedList.get(5), intMyLinkedList.remove(5));
        System.out.printf("intMyLinkedList = %s Size: %d\n", intMyLinkedList, intMyLinkedList.size());
        System.out.println();
        System.out.println("Clear all nodes:");
        strMyLinkedList.clear();
        System.out.printf("strMyLinkedList = %s Size: %d\n", strMyLinkedList, strMyLinkedList.size());
        intMyLinkedList.clear();
        System.out.printf("intMyLinkedList = %s Size: %d\n", intMyLinkedList, intMyLinkedList.size());
    }
}
