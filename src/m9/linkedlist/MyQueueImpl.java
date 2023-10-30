package m9.linkedlist;

import m9.MyQueue;

public class MyQueueImpl<E> extends MyLinkedList<E> implements MyQueue<E> {

    public MyQueueImpl() {
        super();
    }

    @Override
    public E poll() {
        E element = getFirstNode() != null ? getFirstNode().getItem() : null;
        return removeNode(getFirstNode()) ? element : null;
    }

    @Override
    public E peek() {
        return getFirstNode() != null ? getFirstNode().getItem() : null;
    }

}
