/** An SLList is a list of integers, which hides the terrible
 * truth of the nakedness within */
public class SLList {
    /** Nested class
     * The same thing like the IntNode.java file
     * Use private since nobody will have access to IntNode
     * And, we could use 'static' keyword because the nested
     * class will never have access from the external */
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode (int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    public IntNode first;

    /** Create an empty SLList */
    public SLList() {
        size = 0;
        first = null;
    }

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Add x to the front of the list */
    public void addFirst(int x) {
        first = new IntNode(x, first);

        size = size + 1; // One more element! If we want a quick method to find out the size of the list
    }

    /** Return the first item in the list */
    public int getFirst() {
        return first.item;
    }

    /** Add the item to the end of the list */
    public void addLast(int x) {
        size = size + 1; // One more element! If we want a quick method to find out the size of the list

        if (first == null) {
            first = new IntNode(x, null);
            return;
        }
        IntNode p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
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
    private static int size (IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return (1 + size(p.next));
    }

    public int size(){
        return size(first);
    }

    /** What if we need very fast method to find out the size of the list?
     * It means no matter how big the list is, we want a constant time, not a linear time
     * regarding the increasing number of elements in the list */

    /** An easy way: initiate the size of the SLList */
    /** We call this kind of method: cashing */
    public int size = 1;

    private int fastSize() {
        return size;
    }

    public static void main(String[] args) {
        /* Create a list of one integer, namely 10 */
        SLList L = new SLList();
//        L.addFirst(10);
        L.addLast(5);
//        L.addLast(20);
        System.out.println(L.fastSize());

    }
}
