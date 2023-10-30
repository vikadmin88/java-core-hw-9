package m9.linkedlist;

import m9.MyStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> strMyStack = new MyStackImpl<>();
        MyStack<Integer> intMyStack = new MyStackImpl<>();

        System.out.println("Created 2 lists: strMyStack, intMyStack");
        System.out.printf("strMyStack = %s Size: %d\n", strMyStack, strMyStack.size());
        System.out.printf("intMyStack = %s Size: %d\n", intMyStack, intMyStack.size());
        System.out.println();

        System.out.println("Add 6 String nodes: S000...S555:");
        strMyStack.push("S111");
        strMyStack.push("S222");
        strMyStack.push("S333");
        strMyStack.push("S444");
        strMyStack.push("S555");
        strMyStack.push("S666");
        System.out.printf("strMyStack = %s Size: %d\n", strMyStack, strMyStack.size());
        System.out.println();

        System.out.println("Add 6 Integer nodes: 1000...6000:");
        intMyStack.push(1000);
        intMyStack.push(2000);
        intMyStack.push(3000);
        intMyStack.push(4000);
        intMyStack.push(5000);
        intMyStack.push(6000);
        System.out.printf("intMyStack = %s Size: %d\n", intMyStack, intMyStack.size());
        System.out.println();

        System.out.println("Peek (LIFO) nodes:");
        for (int i = 0; i < 3; i++) {
            System.out.println("strMyStack.peek() = " + strMyStack.peek());
        }
        System.out.printf("strMyStack = %s Size: %d\n", strMyStack, strMyStack.size());
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("intMyStack.peek() = " + intMyStack.peek());
        }
        System.out.printf("intMyStack = %s Size: %d\n", intMyStack, intMyStack.size());
        System.out.println();

        System.out.println("Pop (LIFO) nodes:");
        for (int i = 0; i < 7; i++) {
            System.out.println("strMyStack.poll() = " + strMyStack.pop());
            System.out.printf("strMyStack = %s Size: %d\n", strMyStack, strMyStack.size());
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.println("intMyStack.poll() = " + intMyStack.pop());
            System.out.printf("intMyStack = %s Size: %d\n", intMyStack, intMyStack.size());
        }
        System.out.println();

        System.out.println("Clear all nodes:");
        strMyStack.clear();
        System.out.printf("strMyStack = %s Size: %d\n", strMyStack, strMyStack.size());
        intMyStack.clear();
        System.out.printf("intMyStack = %s Size: %d\n", intMyStack, intMyStack.size());
    }
}
