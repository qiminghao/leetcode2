package array;

public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int r1 = 0, r2 = n - 1, c1 = 0, c2 = n - 1, x = 1;
        while (r1 <= r2 && c1 <= c2 && x <= n * n) {
            for (int c = c1; c <= c2; c++) res[r1][c] = x++;
            for (int r = r1 + 1; r <= r2; r++) res[r][c2] = x++;
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c >= c1; c--) res[r2][c] = x++;
                for (int r = r2 - 1; r > r1; r--) res[r][c1] = x++;
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return res;
    }
}
