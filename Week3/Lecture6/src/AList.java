public class AList {
    private int[] items;
    private int size;
    /** Create an empty list. */
    public AList() {
        items = new int[100];
        size = 0;
    }

    /** Insert x into the end of the list. */
    public void addLast(int x) {
        items[size] = x;
        size = size + 1;
    }

    /** Return the last item of the list. */
    public int getLast() {
        return items[size - 1];
    }

    /** Get the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];
    }

    /** Return the size of the list. */
    public int size() {
        return size;
    }
}
