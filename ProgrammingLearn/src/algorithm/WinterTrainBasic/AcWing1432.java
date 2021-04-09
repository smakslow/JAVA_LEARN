package algorithm.WinterTrainBasic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AcWing1432 {
    private static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        int[][] arr = new int[n][n];
        boolean[] cols = new boolean[n], dia = new boolean[2 * n], master = new boolean[2 * n];
        dfs(arr, 0, cols, dia, master, "");
        System.out.println(ans);
    }

    private static void dfs(int[][] arr, int row,
                            boolean[] cols, boolean[] dia, boolean[] master, String s) {
        if (row >= arr.length) {
            ans++;
            if (ans <= 3) System.out.println(s);
            return;
        }
        int len = arr[0].length;
        for (int j = 0; j < len; j++) {
            if (!cols[j] && !dia[row + j] && !master[arr.length + (row - j)]) {
                cols[j] = true;
                dia[row + j] = true;
                master[arr.length + (row - j)] = true;

                dfs(arr, row + 1, cols, dia, master, s + (j + 1) + " ");
                cols[j] = false;
                dia[row + j] = false;
                master[arr.length + (row - j)] = false;
            }
        }

    }
}


