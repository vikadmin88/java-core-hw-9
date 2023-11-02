package m9.hashmap;

import m9.MyMap;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> implements MyMap<K, V> {

    private int countElements;
    private final static int DEF_BUCKET_SIZE = 16;
    private Entry<K,V>[] buckets;

    public MyHashMap() {
        this(DEF_BUCKET_SIZE);
    }

    public MyHashMap(int bucketSize) {
        this.countElements = 0;
        this.buckets = new Entry[bucketSize <= 0 ? DEF_BUCKET_SIZE : bucketSize];

    }

    @Override
    public boolean put(K key, V value) {
        addEntry(key, value);
        return false;
    }

    private void addEntry(K key, V value) {
        int bucket = getBucketNumByHash(key);
        Entry<K, V> newEntry = new Entry<>(key, value, null);

        if (buckets[bucket] == null) {
            buckets[bucket] = newEntry;
            countElements++;
        } else {
            addNewOrReplace(bucket, newEntry);
        }
    }

    private void addNewOrReplace(int bucket, Entry<K,V> newEntry) {
        Entry<K,V>  entry = buckets[bucket];
        if (entry.equals(newEntry)) {
            entry.setValue(newEntry.getValue());
        } else {
            newEntry.setNextEntry(entry);
            buckets[bucket] = newEntry;
            countElements++;
        }
    }

    @Override
    public boolean remove(K key) {
        int bucket = getBucketNumByHash(key);
        Entry<K, V> entry = buckets[bucket];
        Entry<K, V> prevEntry = entry;

        if (entry == null) {
            return false;
        }

        do {

            if (entry.getKey().equals(key)) {
                countElements--;

                // alone
                if (entry.getNextEntry() == null && entry == buckets[bucket]) {
                    buckets[bucket] = null;
                    return true;
                }

                // first
                if (entry.getNextEntry() != null && entry == buckets[bucket]) {
                    buckets[bucket] = entry.getNextEntry();
                    return true;
                }

                // between
                if (entry.getNextEntry() != null && prevEntry.getNextEntry() == entry) {
                    prevEntry.setNextEntry(entry.getNextEntry());
                    entry = null;
                    return true;
                }

                // last
                if (entry.getNextEntry() == null && entry != buckets[bucket]) {
                    prevEntry.setNextEntry(null);
                    entry = null;
                    return true;
                }

            }
            prevEntry = entry;

        } while ((entry = entry.getNextEntry()) != null);

        return false;
    }

    private int getBucketNumByHash(K key) {
        return key.hashCode() % buckets.length;
    }

    @Override
    public boolean clear() {
        this.buckets = new Entry[DEF_BUCKET_SIZE];
        return true;
    }

    @Override
    public int size() {
        return this.buckets.length;
    }

    @Override
    public V get(K key) {
        int bucket = getBucketNumByHash(key);
        Entry<K, V> entry = buckets[bucket];

        if (entry == null) {
            return null;
        }

        do {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        } while ((entry = entry.getNextEntry()) != null);

        return null;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "countElements=" + countElements +
                ", buckets=" + Arrays.toString(buckets) +
                '}';
    }

    protected static class Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> nextEntry;

        Entry(K key, V value, Entry<K, V> nextEntry) {
            this.key = key;
            this.value = value;
            this.nextEntry = nextEntry;
        }

        protected final K getKey() {
            return this.key;
        }

        protected final V getValue() {
            return this.value;
        }
        protected final V setValue(V newValue) {
            V oldValue = this.value;
            this.value = newValue;
            return oldValue;
        }
        protected Entry<K, V> getNextEntry() {
            return this.nextEntry;
        }
        protected void setNextEntry(Entry<K, V> nextEntry) {
            this.nextEntry = nextEntry;
        }
        public final String toString() {
            return this.key + "=" + this.value;
        }

        public final int hashCode() {
            return Objects.hashCode(this.key);
        }

        public final boolean equals(Object o) {
            if (o == this) {
                return true;
            } else {
                if (o instanceof Entry) {
                    Entry<?, ?> e = (Entry<?, ?>) o;
                    return Objects.equals(this.key, e.getKey());
                }
                return false;
            }
        }
    }
}
