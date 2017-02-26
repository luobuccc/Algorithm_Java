/**
 * Created by PuFan on 2017/2/26.
 */
public class quick_union extends UF_API {
    public quick_union(int count) {
        super(count);
    }

    @Override
    public int find(int p) {
        while (p != id[p])
            p = id[p];
        return p;
    }

    @Override
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot)
            return;
        id[pRoot] = qRoot;
        count--;
    }
}
