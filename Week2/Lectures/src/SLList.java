/** An SLList is a list of integers, which hides the terrible
 * truth of the nakedness within */
public class SLList<T> {
    /** Nested class
     * The same thing like the IntNode.java file
     * Use private since nobody will have access to IntNode
     * And, we could use 'static' keyword because the nested
     * class will never have access from the external */
    private class Node {
        public T item;
        public Node next;

        public Node (T i, Node n) {
            item = i;
            next = n;
        }
    }

    /* The first item (if exists) is at sentinel.next */
    private Node sentinel;

//    public Node first;

    /** Create an empty SLList */
    public SLList() {
        sentinel = new Node(null, null); // You can set -1 or any number you want. It doesn't matter.
        size = 0;
//        first = null;
    }

    public SLList(T x) {
        /* Use a sentinel */
        sentinel = new Node(x, null);
        sentinel.next = new Node(x, null);
//        first = new Node(x, null);
        size = 1;
    }

    /** Add x to the front of the list */
    public void addFirst(T x) {
        /* Use a sentinel */
        sentinel.next = new Node(x, sentinel.next);
//        first = new IntNode(x, first);

        size = size + 1; // One more element! If we want a quick method to find out the size of the list
    }

    /** Return the first item in the list */
    public T getFirst() {
        /* Use a sentinel */
        return sentinel.next.item;
//        return first.item;
    }

    /** Add the item to the end of the list */
    public void addLast(T x) {
        size = size + 1; // One more element! If we want a quick method to find out the size of the list

        /* Use a sentinel */
        Node p = sentinel;

//        if (first == null) {
//            first = new Node(x, null);
//            return;
//        }
//        Node p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(x, null);
    }

    /** Return the size of the whole list
     * This is an iterative method */
    /** public int size() {
        IntNode p = first;
        int n = 0;
        while (p != null) {
            n = n + 1;
            p = p.next;
        }
        return n;
    } */

    /** The following is the recursive method, we need a help
     * function at first
     */

    /** Return the size of the list that starts at IntNode p */
//    private static int size (Node p) {
//        if (p.next == null) {
//            return 1;
//        }
//        return (1 + size(p.next));
//    }
//
//    public int size(){
//        return size(first);
//    }

    /** What if we need very fast method to find out the size of the list?
     * It means no matter how big the list is, we want a constant time, not a linear time
     * regarding the increasing number of elements in the list */

    /** An easy way: initiate the size of the SLList */
    /** We call this kind of method: cashing */
    public int size = 0;

    private int fastSize() {
        return size;
    }

    public static void main(String[] args) {
        /* Create a list of one integer, namely 10 */
//        SLList L = new SLList();
//        L.addFirst(10);
//        L.addLast(5);
//        L.addLast(20);
//        System.out.println(L.fastSize());

        SLList<Object> sl = new SLList<>(2);
        sl.addLast("string");
        System.out.println(sl);
    }
}
