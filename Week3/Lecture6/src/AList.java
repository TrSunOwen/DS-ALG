public class AList<T> {
    private T[] items;
    private int size;
    /** Create an empty list. */
    public AList() {
        items = (T[])new Object[100];
        size = 0;
    }

    /** Resize if the list is full. */
    public void resize(int capacity) {
        T[] a = (T[])new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** Insert x into the end of the list. */
    public void addLast(T x) {
        if (size == items.length) { /** Resize if the list is full. */
            resize(size + 1);
        }
        items[size] = x;
        size = size + 1;
    }

    /** Return the last item of the list. */
    public T getLast() {
        return items[size - 1];
    }

    /** Get the ith item in the list (0 is the front). */
    public T get(int i) {
        return items[i];
    }

    /** Return the size of the list. */
    public int size() {
        return size;
    }

    /** Remove and return the last item. */
    public T removeLast() {
        T x = getLast();
        items[size - 1] = null;
        size = size - 1;
        return x;
    }

    public static void main(String[] args) {
        AList L = new AList();
        L.addLast(3);
        L.addLast(5);
    }
}
