package m9.linkedlist;

import m9.MyList;

import java.util.Arrays;

public class MyLinkedList<E> extends MyAbstractLinkedList<E> implements MyList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public MyLinkedList() {
        this.size = 0;
    }

    public boolean add(E element) {
        addTail(element);
        return true;
    }

    protected void addHead(E element) {
        Node<E> newNode = new Node<>(null, element, first);
        if (first == null) {
            first = last = newNode;
        } else {
            first.prev = newNode;
            first = newNode;
        }
        size++;
    }
    protected void addTail(E element) {
        Node<E> newNode = new Node<>(last, element, null);
        if (last == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public boolean remove(int index) {
        Node<E> node = getByIndex(index);
        return node != null && removeNode(node);
    }

    protected boolean removeNode(Node<E> node) {
        if (node == null) {
            return false;
        }
        Node<E> next = node.next;
        Node<E> prev = node.prev;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            node.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }

        node.item = null;
        size--;

        return true;
    }

    public boolean clear() {
        if (size <= 0) {
            return false;
        }
        Node<E> curr = last;
        Node<E> xPrev = curr.prev;
        while (size > 0) {
            curr.prev = null;
            curr.item = null;
            curr.next = null;
            size--;
            if (xPrev == null) {
                return true;
            }
            curr = xPrev;
            xPrev = xPrev.prev;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        Node<E> node = getByIndex(index);
        return node != null ? node.item : null;
    }

    private Node<E> getByIndex(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        Node<E> x;
        int i;
        if (index < this.size >> 1) {
            x = this.first;
            for(i = 0; i < index; ++i) {
                x = x.next;
            }
            return x;
        } else {
            x = this.last;
            for(i = this.size - 1; i > index; --i) {
                x = x.prev;
            }
            return x;
        }
    }

    public Object[] toArray() {
        if (size == 0) {
            return new Object[0];
        }
        Object[] result = new Object[this.size];
        int i = 0;
        for(Node<E> x = this.first; x != null; x = x.next) {
            result[i++] = x.item;
        }
        return result;
    }

    @Override
    public String toString() {
        return "{ " + Arrays.toString(toArray()) + " }";
    }

    protected Node<E> getFirstNode() {
        return this.first;
    }
    protected Node<E> getLastNode() {
        return this.last;
    }

    protected static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
        E getItem() {
            return this.item;
        }
    }
}
