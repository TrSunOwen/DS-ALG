public class SLList {
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int x, IntNode n) {
            item = x;
            next = n;
        }
    }

    public IntNode first;
    private int size;

    public SLList() {
        first = null;
        size = 0;
    }

    public SLList (int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
        size = size + 1;
    }

    public void addLast(int x) {
        size = size + 1;

        if (first == null) {
            first = new IntNode(x, null);
            return;
        }

        IntNode p = first;
        if (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    public int size() {
        return size;
    }

    public int getFirst() {
        return first.item;
    }

}
