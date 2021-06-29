/**
 * Minimal changes needed:
 *      Use parent[] array as before, but also add size[] array.
 *      isConnected(int p, int q) requires no changes.
 *      connect(int p, int q) needs two changes:
 *          Link root of smaller tree to larger tree.
 *          Update size[] array.
 */

public class WeightedQuickUnionDS implements DisjointSets {
   private int[] parent;
   private int[] size;

    private int find(int p) {
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    @Override
    public void connect(int p, int q) {
       int i = find(p);
       int j = find(q);

       /** They have the same root. */
       if (i == j) {
           return;
       }

       /** the smaller root is connected to the larger root. */
       if (size[i] < size[j]) {
           parent[i] = j;
           size[j] += size[i];
       } else {
           parent[j] = i;
           size[i] += size[j];
       }
    }

    @Override
    public boolean isConnected(int p, int q) {
        return (find(p) == find(q));
    }
}
