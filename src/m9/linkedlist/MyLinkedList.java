package m9.linkedlist;

import m9.MyAbstractLinkedList;
import m9.MyList;

import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedList<E> extends MyAbstractLinkedList<E> implements MyList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public boolean add(E element) {
        addTail(element);
        return true;
    }

    public MyLinkedList() {
        this.size = 0;
    }

    private void addHead(E element) {
        Node<E> newNode = new Node<E>(null, element, first);
        if (first == null) {
            first = last = newNode;
        } else {
            first.prev = newNode;
            first = newNode;
        }
        size++;
    }
    private void addTail(E element) {
        Node<E> newNode = new Node<E>(last, element, null);
        if (last == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public boolean remove(int index) {
        Node<E> current = getByIndex(index);
        Node<E> next = current.next;
        Node<E> prev = current.prev;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            current.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            current.next = null;
        }

        current.item = null;
        size--;
        return true;
    }

    public boolean clear() {
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
        if (index >= 0 && index < size) {
            return getByIndex(index).item;
        }
        return null;
    }

    private Node<E> getByIndex(int index) {
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
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
