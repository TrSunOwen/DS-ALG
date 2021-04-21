/**
 * Discussion_1 part of Week3 */
public class SLListPractice {
    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private IntNode first;

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /** Implement SLList.insert which takes in an integer x and inserts it at the given
    position. If the position is after the end of the list, insert the new node at the end.
    For example, if the SLList is 5 → 6 → 2, insert(10, 1) results in 5 → 10 → 6 → 2. */
    public void insert(int item, int position) {
        /** What if the first node is null or we want to insert the item at the front? */
        if (first == null || position == 0) {
            this.addFirst(item);
            return;
        }
        /** A counter */
        int count = 0;

        /** A pointer to scan the list */
        IntNode p = first;

        /** Avoid null pointer error! */
        while (count < (position - 1) && p.next != null) {
            p = p.next;
            count++;
        }
        p.next = new IntNode(item, p.next);
    }

    /** Add another method to the SLList class that reverses the elements. Do this using
    the existing IntNodes (you should not use new). */
    public void reverse() {
        /** Special situations */
        if (first == null || first.next == null) {
            return;
        }
        /** Create a helper pointer. */
        IntNode p = first.next;

        /** It becomes the end now! */
        first.next = null;

       while (p != null) {
           IntNode temp = p.next;
           p.next = first;
           first = p;
           p = temp;
       }
    }

    /** Write a second version that uses recursion
            (you may need a helper method). */
    public void recursiveReverse() {
        first = recursiveReverseHelper(first);
    }

    private IntNode recursiveReverseHelper(IntNode lst) {
        if (lst == null || lst.next == null) {
            return lst;
        } else {
            IntNode endOfReversed = lst.next;
            IntNode reversed = recursiveReverseHelper(lst.next);

            endOfReversed.next = lst;
            lst.next = null;
            return reversed;
        }
    }

    public static void main(String[] args) {
        SLListPractice L = new SLListPractice();
        L.addFirst(6);
        L.addFirst(5);
        L.addFirst(2);
//        L.insert(5, 0);
//        L.insert(6, 1);
//        L.insert(7, 2);
//        L.insert(8, 3);

        L.recursiveReverse();
    }
}
