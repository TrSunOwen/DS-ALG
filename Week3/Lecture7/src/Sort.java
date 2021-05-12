public class Sort {
    /** Sort strings destructively */
    public static void sort(String[] x) {
        // Find the smallest item
        // Move it to the front
        // Selection sort the rest (use recursion?)

    }

    /** Swap item a with b. */
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    /** Return the smallest string in x. */
    public static String findSmallest(String[] x) {
        int smallestIndex = 0;
        for (int i = 0; i < x.length; i++) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return x[smallestIndex];
    }
}
