public class RotatingSLList<Item> extends SLList<Item> {
    /** To do: Implement RotatingSLList such that code compiles and outputs correct results. */

    /** Rotate list to the right. */
    public void rotateRight() {
        Item x = removeLast();
        addFirst(x);
    }

    public static void main(String[] args) {
        RotatingSLList<Integer> rsl = new RotatingSLList<>();
        /* Create SList: [10, 11, 12, 13] */
        rsl.addLast(10);
        rsl.addLast(11);
        rsl.addLast(12);
        rsl.addLast(13);

        /* Should be [13 10 11 12] */
        rsl.rotateRight();
        rsl.print();
    }
}
