public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list by using recursion */
    public int size() {
        if (this.rest == null) {
            return 1;
        }
        return (1 + this.rest.size());
    }

    /** Return the size of the list by using no recursion */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /** Return the element of the specific index */
    /** Return the ith item of this IntList */
    public int get(int i) {
        if (i == 0) {
            return this.first;
        }
        i--;
        return this.rest.get(i);
    }

    public String toString() {
        if (rest == null)
            return Integer.toString(first);
        return Integer.toString(first) + " " + rest.toString();
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        if (L == null) {
            return null;
        }
        IntList t = new IntList(L.first + x, null);
        t.rest = incrList(t.rest,x);
        return t;
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        if (L == null) {
            return L;
        }
        L.first = L.first + x;
        dincrList(L.rest, x);
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

//        System.out.println(L.size());
//        System.out.println(L.iterativeSize());
//        System.out.println(L.get(2));

        /** Test incrList() */
        System.out.println(L);
        System.out.println(incrList(L, 3));
        System.out.println(L);

        /** Test dincrList() */
        System.out.println(L);
        System.out.println(dincrList(L, 3));
        System.out.println(L);
    }
}