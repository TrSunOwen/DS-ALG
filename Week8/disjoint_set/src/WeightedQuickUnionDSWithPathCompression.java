public class WeightedQuickUnionDSWithPathCompression implements DisjointSets {
    private int[] parent;
    private int[] size;

    public WeightedQuickUnionDSWithPathCompression (int N) {
        parent = new int[N];
        size = new int[N];

        for (int i = 0; i < N; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    private int find(int p) {
        if (p == parent[p]) {
            return p;
        } else {
            parent[p] = find(parent[p]);
            return parent[p];
        }
    }

    @Override
    public void connect(int p, int q) {
        int i = find(p);
        int j = find(q);

        if (i == j) {
            return;
        }
        if (size[i] < size[j]) {
            parent[i] = j; size[j] += size[i];
        } else {
            parent[j] = i; size[i] += size[j];
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        return (find(p) == find(q));
    }

    public static void main(String[] args) {
        WeightedQuickUnionDSWithPathCompression q = new WeightedQuickUnionDSWithPathCompression(8);
        q.connect(1, 2);
        q.connect(0, 5);
        q.connect(4, 6);
        q.connect(7, 3);
        q.connect(6, 1);
        q.connect(6, 4);
        q.connect(6, 3);
    }
}
