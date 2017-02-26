/**
 * Created by PuFan on 2017/2/26.
 */
public class quick_find extends UF_API {
    public quick_find(int count) {
        super(count);
    }

    @Override
    public int find(int p) {
        return id[p];
    }

    @Override
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        if (pID == qID)
            return;
        for (int i = 0; i < id.length; ++i)
            if (id[i] == pID)
                id[i] = qID;
        count--;
    }
}
