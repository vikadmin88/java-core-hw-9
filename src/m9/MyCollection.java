package m9;

public interface MyCollection<E> {
    boolean add(E element);
    boolean remove(int index);
    boolean clear();
    int size();
}
