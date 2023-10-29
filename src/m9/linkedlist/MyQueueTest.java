package m9.linkedlist;

import m9.MyQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> strMyQueue = new MyQueueImpl<>();
        MyQueue<Integer> intMyQueue = new MyQueueImpl<>();

        System.out.println("Created 2 lists: strMyQueue, intMyQueue");
        System.out.printf("strMyQueue = %s Size: %d\n", strMyQueue, strMyQueue.size());
        System.out.printf("intMyQueue = %s Size: %d\n", intMyQueue, intMyQueue.size());
        System.out.println();

        System.out.println("Add 6 String nodes: S000...S555:");
        strMyQueue.add("S111");
        strMyQueue.add("S222");
        strMyQueue.add("S333");
        strMyQueue.add("S444");
        strMyQueue.add("S555");
        strMyQueue.add("S666");
        System.out.printf("strMyQueue = %s Size: %d\n", strMyQueue, strMyQueue.size());
        System.out.println();

        System.out.println("Add 6 Integer nodes: 1000...6000:");
        intMyQueue.add(1000);
        intMyQueue.add(2000);
        intMyQueue.add(3000);
        intMyQueue.add(4000);
        intMyQueue.add(5000);
        intMyQueue.add(6000);
        System.out.printf("intMyQueue = %s Size: %d\n", intMyQueue, intMyQueue.size());
        System.out.println();

        System.out.println("Peek (FIFO) nodes:");
        System.out.println("strMyQueue.peek() = " + strMyQueue.peek());
        System.out.println("strMyQueue.peek() = " + strMyQueue.peek());
        System.out.println("strMyQueue.peek() = " + strMyQueue.peek());
        System.out.printf("strMyQueue = %s Size: %d\n", strMyQueue, strMyQueue.size());
        System.out.println();
        System.out.println("intMyQueue.peek() = " + intMyQueue.peek());
        System.out.println("intMyQueue.peek() = " + intMyQueue.peek());
        System.out.println("intMyQueue.peek() = " + intMyQueue.peek());
        System.out.printf("intMyQueue = %s Size: %d\n", intMyQueue, intMyQueue.size());
        System.out.println();

        System.out.println("Poll (FIFO) nodes:");
        System.out.println("strMyQueue.poll() = " + strMyQueue.poll());
        System.out.printf("strMyQueue = %s Size: %d\n", strMyQueue, strMyQueue.size());
        System.out.println("strMyQueue.poll() = " + strMyQueue.poll());
        System.out.printf("strMyQueue = %s Size: %d\n", strMyQueue, strMyQueue.size());
        System.out.println("strMyQueue.poll() = " + strMyQueue.poll());
        System.out.printf("strMyQueue = %s Size: %d\n", strMyQueue, strMyQueue.size());
        System.out.println();
        System.out.println("intMyQueue.poll() = " + intMyQueue.poll());
        System.out.printf("intMyQueue = %s Size: %d\n", intMyQueue, intMyQueue.size());
        System.out.println("intMyQueue.poll() = " + intMyQueue.poll());
        System.out.printf("intMyQueue = %s Size: %d\n", intMyQueue, intMyQueue.size());
        System.out.println("intMyQueue.poll() = " + intMyQueue.poll());
        System.out.println("intMyQueue.poll() = " + intMyQueue.poll());
        System.out.println("intMyQueue.poll() = " + intMyQueue.poll());
        System.out.println("intMyQueue.poll() = " + intMyQueue.poll());
        System.out.println("intMyQueue.poll() = " + intMyQueue.poll());
        System.out.printf("intMyQueue = %s Size: %d\n", intMyQueue, intMyQueue.size());
        System.out.println();

        System.out.println("Clear all nodes:");
        strMyQueue.clear();
        System.out.printf("strMyQueue = %s Size: %d\n", strMyQueue, strMyQueue.size());
        intMyQueue.clear();
        System.out.printf("intMyQueue = %s Size: %d\n", intMyQueue, intMyQueue.size());
    }
}
