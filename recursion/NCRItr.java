
public class NCRItr {
    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static long ncrRecursive(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
        if (r > n) {
            return 0;
        }
        return ncrRecursive(n - 1, r - 1) + ncrRecursive(n - 1, r);
    }

    static int ncr(int n, int r) {
        if (r > n)
            return 0;
        int factN = fact(n);
        int factR = fact(r);
        int facrNR = fact(n - r);
        return factN / (factR * facrNR);
    }

    public static void main(String[] args) {
        // System.out.println(ncr(11, 1));

        for (int i = 0; i < 5; i++) {
            // int arr[] = new int[5];
            for (int j = 0; j <= i; j++) {
                // arr[j] = ncr(i, j);
                System.out.print(ncrRecursive(i, j) + "\t");
            }
            System.out.println();
        }

    }
}
