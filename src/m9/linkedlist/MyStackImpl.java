package m9.linkedlist;

import m9.MyStack;

public class MyStackImpl<E> extends MyLinkedList<E> implements MyStack<E> {

    public MyStackImpl() {
        super();
    }

    @Override
    public boolean push(E element) {
        addTail(element);
        return true;
    }

    @Override
    public E pop() {
        E element = getLastNode() != null ? getLastNode().getItem() : null;
        return removeNode(getLastNode()) ? element : null;
    }

    @Override
    public E peek() {
        return getLastNode() != null ? getLastNode().getItem() : null;
    }
}
