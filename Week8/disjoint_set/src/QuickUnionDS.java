public class QuickUnionDS implements DisjointSets {
    private int[] parent;

    public QuickUnionDS(int n) {
        parent = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

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

        parent[i] = j;
    }

    @Override
    public boolean isConnected(int p, int q) {
        return (find(p) == find(q));
    }

}
