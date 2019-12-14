package array;

public class MultiplyStrings {
    /*
     *  |   |   | 1 | 2 | 3 |
     *  |   |   |   | 4 | 5 |
     *   ____________________
     *  |   |   |   | 1 | 5 |
     *  |   |   | 1 | 0 |   |
     *  |   | 0 | 5 |   |   |
     *   ....................
     *  |   |   | 1 | 2 |   |
     *  |   | 0 | 8 |   |   |
     *  | 0 | 4 |   |   |   |
     *   ____________________
     *  | 0 | 1 | 2 | 3 | 4 |    index
     *  |   |   |   |   |   |
     * num1[i] * num2[j]` will be placed at indices `[i + j`, `i + j + 1]
     * */
    public static String multiply(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int len1 = num1.length(), len2 = num2.length();
        int[] pos = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];
                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }
        }
        for (int p : pos) if (!(res.length() == 0 && p == 0)) res.append(p);
        return res.length() == 0 ? "0" : res.toString();
    }
}
