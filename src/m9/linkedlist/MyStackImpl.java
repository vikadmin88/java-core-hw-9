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
        if (getLastNode() != null) {
            E element = getLastNode().item;
            if (!removeNode(getLastNode())) {
                return null;
            }
            return element;
        }
        return null;
    }

    @Override
    public E peek() {
        return getLastNode() != null ? getLastNode().item : null;
    }
}
