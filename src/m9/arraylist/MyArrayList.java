package m9.arraylist;

import m9.MyList;

import java.util.Arrays;

public class MyArrayList<E> extends MyAbstractArrayList<E> implements MyList<E> {
    private Object[] arrList;
    private int countUsedCell = 0;

    public MyArrayList() {
        this(10);
    }
    public MyArrayList(int length) {
        length = length <= 0 ? 10 : length;
        this.arrList = new Object[length];
    }

    public E get(int index) {
        if (index < 0 || index > arrList.length - 1) {
            return null;
        }
        return (E) arrList[index];
    }

    public int size() {
        return arrList.length;
    }

    public boolean remove(int index) {
        if (index <= countUsedCell -1 && arrList[index] != null) {
            arrList[index] = null;
            countUsedCell--;
            return true;
        }
        return false;
    }

    public boolean clear() {
        this.arrList = new Object[0];
        countUsedCell = 0;
        return true;
    }
    public boolean add(E element) {
        // check/expand arrList
        checkArraySize();
        return addElement(element);
    }

    private void checkArraySize() {
        if (arrList.length == countUsedCell) {
            int newSize = arrList.length * 3 / 2 + arrList.length;
            this.arrList = growArray(arrList, newSize);
        }
    }
    private Object[] growArray(Object[] currentArr, int newSize) {
        return Arrays.copyOf(currentArr, newSize);
    }

    private boolean addElement(E element) {
        for (int i = 0; i < arrList.length; i++) {
            if (arrList[i] == null) {
                arrList[i] = (E) element;
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
