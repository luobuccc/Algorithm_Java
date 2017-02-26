/**
 * Created by PuFan on 2017/2/26.
 */
public abstract class UF_API {
    public int[] id;
    public int count;

    public UF_API(int count) {
        this.count = count;
        id = new int[count];
        for (int i = 0; i < count; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public abstract int find(int p);

    public abstract void union(int p, int q);

}
