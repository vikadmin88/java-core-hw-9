package m9;

public interface MyStack<E> extends MyCollection<E> {

    boolean push(E element);
    E pop();

    E peek();
}