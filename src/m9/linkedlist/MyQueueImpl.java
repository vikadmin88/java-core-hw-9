package m9.linkedlist;

import m9.MyQueue;

public class MyQueueImpl<E> extends MyLinkedList<E> implements MyQueue<E> {

    public MyQueueImpl() {
        super();
    }

    @Override
    public E poll() {
        if (getFirstNode() != null) {
            E element = getFirstNode().item;
            if (!removeNode(getFirstNode())) {
                return null;
            }
            return element;
        }
        return null;
    }

    @Override
    public E peek() {
        return getFirstNode() != null ? getFirstNode().item : null;
    }

}
