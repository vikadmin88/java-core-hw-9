package m9;

public interface MyQueue<E> extends MyCollection<E> {

    E poll();

    E peek();
}