package m9.queue;

import m9.MyList;
import m9.MyQueue;
import m9.linkedlist.MyLinkedList;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> strMyQueueList = new MyLinkedList<>();
        MyQueue<Integer> intMyQueueList = new MyLinkedList<>();

        System.out.println("Created 2 lists: strMyQueueList, intMyQueueList");
        System.out.printf("strMyQueueList = %s Size: %d\n", strMyQueueList, strMyQueueList.size());
        System.out.printf("intMyQueueList = %s Size: %d\n", intMyQueueList, intMyQueueList.size());
        System.out.println();

        System.out.println("Add 6 String nodes: S000...S555:");
        strMyQueueList.add("S000");
        strMyQueueList.add("S111");
        strMyQueueList.add("S222");
        strMyQueueList.add("S333");
        strMyQueueList.add("S444");
        strMyQueueList.add("S555");
        System.out.printf("strMyQueueList = %s Size: %d\n", strMyQueueList, strMyQueueList.size());
        System.out.println();

        System.out.println("Add 6 Integer nodes: 1000...6000:");
        intMyQueueList.add(1000);
        intMyQueueList.add(2000);
        intMyQueueList.add(3000);
        intMyQueueList.add(4000);
        intMyQueueList.add(5000);
        intMyQueueList.add(6000);
        System.out.printf("intMyQueueList = %s Size: %d\n", intMyQueueList, intMyQueueList.size());
        System.out.println();

        System.out.println("Peek nodes:");
        System.out.println("strMyQueueList.peek() = " + strMyQueueList.peek());
        System.out.println("strMyQueueList.peek() = " + strMyQueueList.peek());
        System.out.println("strMyQueueList.peek() = " + strMyQueueList.peek());
        System.out.printf("strMyQueueList = %s Size: %d\n", strMyQueueList, strMyQueueList.size());
        System.out.println();
        System.out.println("intMyQueueList.peek() = " + intMyQueueList.peek());
        System.out.println("intMyQueueList.peek() = " + intMyQueueList.peek());
        System.out.println("intMyQueueList.peek() = " + intMyQueueList.peek());
        System.out.printf("intMyQueueList = %s Size: %d\n", intMyQueueList, intMyQueueList.size());
        System.out.println();

        System.out.println("Poll nodes:");
        System.out.println("strMyQueueList.poll() = " + strMyQueueList.poll());
        System.out.printf("strMyQueueList = %s Size: %d\n", strMyQueueList, strMyQueueList.size());
        System.out.println("strMyQueueList.poll() = " + strMyQueueList.poll());
        System.out.printf("strMyQueueList = %s Size: %d\n", strMyQueueList, strMyQueueList.size());
        System.out.println("strMyQueueList.poll() = " + strMyQueueList.poll());
        System.out.printf("strMyQueueList = %s Size: %d\n", strMyQueueList, strMyQueueList.size());
        System.out.println();
        System.out.println("intMyQueueList.poll() = " + intMyQueueList.poll());
        System.out.printf("intMyQueueList = %s Size: %d\n", intMyQueueList, intMyQueueList.size());
        System.out.println("intMyQueueList.poll() = " + intMyQueueList.poll());
        System.out.printf("intMyQueueList = %s Size: %d\n", intMyQueueList, intMyQueueList.size());
        System.out.println("intMyQueueList.poll() = " + intMyQueueList.poll());
        System.out.println("intMyQueueList.poll() = " + intMyQueueList.poll());
        System.out.println("intMyQueueList.poll() = " + intMyQueueList.poll());
        System.out.println("intMyQueueList.poll() = " + intMyQueueList.poll());
        System.out.println("intMyQueueList.poll() = " + intMyQueueList.poll());
        System.out.printf("intMyQueueList = %s Size: %d\n", intMyQueueList, intMyQueueList.size());
        System.out.println();

        System.out.println("Clear all nodes:");
        strMyQueueList.clear();
        System.out.printf("strMyQueueList = %s Size: %d\n", strMyQueueList, strMyQueueList.size());
        intMyQueueList.clear();
        System.out.printf("intMyQueueList = %s Size: %d\n", intMyQueueList, intMyQueueList.size());
    }
}
