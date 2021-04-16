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

    /** Implement square and squareMutative which are static methods that both take in
    an IntList L and return an IntList with its integer values all squared. square does
    this non-mutatively with recursion by creating new IntLists while squareMutative
    uses a recursive approach to change the instance variables of the input IntList L. */

    public static IntList square (IntList L) {
        // recursion method
//        if (L == null) {
//            return L;
//        } else {
//            IntList rest = square(L.rest);
//            IntList M = new IntList(L.first * L.first, rest);
//            return M;
//        }

        // interation method
        if (L == null) {
            return L;
        }
        IntList B = L.rest;
        IntList M = new IntList(L.first * L.first, null);
        IntList C = M;
        while (B != null) {
            C.rest = new IntList(B.first * B.first, null);
            B = B.rest;
            C = C.rest;
        }
        return M;
    }

    public static IntList squareMutative (IntList L) {
        // iteration method
//        IntList B = L;
//        while (B != null) {
//            B.first = B.first * B.first;
//            B = B.rest;
//        }
//        return L;

        // recursion method
        if (L == null) {
            return L;
        }
        L.first = L.first * L.first;
        squareMutative(L.rest);
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
//        System.out.println(L);
//        System.out.println(incrList(L, 3));
//        System.out.println(L);

//        /** Test dincrList() */
//        System.out.println(L);
//        System.out.println(dincrList(L, 3));
//        System.out.println(L);

        /** Test square() */
//        System.out.println(square(L));

        /** Test squareMutative() */
        System.out.println(squareMutative(L));
    }
}