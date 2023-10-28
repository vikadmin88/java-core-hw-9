package m9.arraylist;

import m9.MyAbstractList;
import m9.MyList;

import java.util.Arrays;

public class MyArrayList<E> extends MyAbstractList<E> implements MyList<E> {
    private Object[] arrList;
    private int countUsedCell = 0;

    public MyArrayList() {
        this(0);
    }
    public MyArrayList(int length) {
        if (length < 0) {
            length = 0;
        }
        this.arrList = new Object[length];
    }

    public E get(int index) {
        return (E) arrList[index];
    }

    public int size() {
        return arrList.length;
    }

    public boolean remove(int index) {
        if (arrList[index] != null) {
            arrList[index] = null;
            countUsedCell--;
            return true;
        }
        return false;
    }

    public boolean clear() {
        this.arrList = new Object[0];
        countUsedCell = 0;
        return false;
    }
    public boolean add(E element) {
        // check/expand arrList
        processingArraySize();
        return addElement(element);
    }

    private void processingArraySize() {
        if (arrList.length < (countUsedCell + 1)) {
            int newSize = arrList.length * 3 / 2 + arrList.length;
            this.arrList = expandArray(arrList, newSize);
        }
    }
    private Object[] expandArray(Object[] currentArr, int newSize) {
        return Arrays.copyOf(currentArr, newSize);
    }

    private boolean addElement(E element) {
        for (int i = 0; i < arrList.length; i++) {
            if (arrList[i] == null) {
                arrList[i] = element;
                countUsedCell++;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arrList=" + Arrays.toString(arrList) +
                '}';
    }
}
