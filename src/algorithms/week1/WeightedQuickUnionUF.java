package algorithms.week1;

public class WeightedQuickUnionUF {

    private int[] id;
    private int[] size;

    public WeightedQuickUnionUF(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    private int root(int i) {
        while(i != id[i]) i = id[i];
        return i;
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int rootp = root(p);
        int rootq = root(q);
        if (rootp == rootq) return;
        if (size[rootp] < size[rootq]) {
            id[rootp] = rootq;
            size[rootq] = size[rootp] + size[rootq];
        } else {
            id[rootq] = id[rootp];
            size[rootp] = size[rootp] + size[rootq];
        }
    }
}
