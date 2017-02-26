/**
 * Created by PuFan on 2017/2/26.
 */
public class weight_quick_union extends UF_API {
    public int[] weight;

    public weight_quick_union(int count) {
        super(count);
        weight = new int[count];
        for (int i = 0; i < count; i++) {
            weight[i] = 1;
        }
    }

    @Override
    public int find(int p) {
        int temp = p;
        while (p != id[p])
            p = id[p];                //p为根节点
        while (temp != p) {             //路径压缩操作
            int j = id[temp];         //用j暂存id[temp]的父节点
            id[temp] = p;        //parent[x]指向根节点
            temp = j;                    //k移到父节点
        }
        return p;
    }

    @Override
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot)
            return;
        if (weight[pRoot] < weight[qRoot]) {
            id[pRoot] = qRoot;
            weight[qRoot] += weight[pRoot];
        } else {
            id[qRoot] = pRoot;
            weight[pRoot] += weight[qRoot];
        }
        count--;
    }
}
