class LRUCache {
    HashMap<Integer, Node> map;
    DoubleList cache;
    Integer cap;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        cache = new DoubleList();
        this.cap = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        int val = map.get(key).value;
        put(key, val);
        return val;
    }

    public void put(int key, int value) {
        Node node = new Node(key, value);
        if (map.containsKey(key)) {
            cache.remove(map.get(key));
            cache.addFirst(node);
            map.put(key, node);
        } else {
            if (cap == cache.size) {
                Node x = cache.removeLast();
                map.remove(x.key);
            }
            cache.addFirst(node);
            map.put(key, node);
        }
    }
}

class DoubleList {
    Node head, tail;
    int size;

    public DoubleList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        this.size = 0;
    }

    /**
     * add a node as the first node of the linked list
     *
     * @param node
     */
    public void addFirst(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
        size++;
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    public Node removeLast() {
        if (tail.prev.equals(head)) {
            return null;
        }
        Node last = tail.prev;
        remove(last);
        return last;
    }

    public int size() {
        return this.size;
    }

}

class Node {
    public int key, value;
    public Node next, prev;

    public Node(int k, int v) {
        this.key = k;
        this.value = v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return key == node.key &&
                value == node.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}