public class LRUCache {
    private HashMap<Integer, Entry> cache;
    private Entry head, tail;
    private int capacity;

    class Entry {
        public int key, value;
        public Entry prev, next;
        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
            this.prev = this.next = null;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<Integer, Entry>();
        this.head = this.tail = null;
    }

    private void remove(Entry entry) {
        if (entry.prev != null) entry.prev.next = entry.next;
        else head = entry.next;
        if (entry.next != null) entry.next.prev = entry.prev;
        else tail = entry.prev;
    }

    private void setHead(Entry entry) {
        entry.next = head;
        entry.prev = null;
        if (head != null) head.prev = entry;
        head = entry;
        if (tail == null) tail = entry;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Entry entry = cache.get(key);
            remove(entry);
            setHead(entry);
            return entry.value;
        }
        return -1;
    }

    public void set(int key, int value) {
        if (cache.containsKey(key)) {
            Entry entry = cache.get(key);
            entry.value = value;
            remove(entry);
            setHead(entry);
        } else {
            if (cache.size() >= this.capacity) {
                cache.remove(tail.key);
                remove(tail);
            }
            Entry entry = new Entry(key, value);
            setHead(entry);
            cache.put(key, entry);
        }
    }
}