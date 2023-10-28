package m9;

public interface MyList<E> {
    boolean add(E element);
    boolean remove(int index);
    boolean clear();
    int size();
    E get(int index);
}
