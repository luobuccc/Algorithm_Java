import java.util.Scanner;

/**
 * Created by PuFan on 2017/2/26.
 */
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = 10;
        quick_union uf = new quick_union(N);

        System.out.println("Input p and q :");
        while (N != 0) {
            N--;
            int p = in.nextInt();
            int q = in.nextInt();
            if (uf.connected(p, q))
                continue;
            uf.union(p, q);
        }
        System.out.println(uf.count() + " components");
    }
}


