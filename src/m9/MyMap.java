package m9;


public interface MyMap<K, V> {

    boolean put(K key, V value);
    boolean remove(K key);
    boolean clear();
    int size();
    V get(K key);
}
