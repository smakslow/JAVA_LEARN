package pat.advanced;

import java.io.*;
import java.util.StringTokenizer;

public class PatA1046 {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        init(System.in);
        int n = nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = nextInt() + arr[i - 1];
        }
        int m = nextInt();
        for (int i = 0; i < m; i++) {
            int left = nextInt();
            int right = nextInt();
            if (left > right) {
                int temp = right;
                right = left;
                left = temp;
            }
            out.println(Math.min(arr[right - 1] - arr[left - 1], arr[n] - arr[right - 1] + arr[left - 1]));
        }
        out.flush();
        out.close();
    }

    private static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
