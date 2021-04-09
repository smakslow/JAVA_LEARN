package niukecontest.xinankeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class C {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int[] arr = new int[1010];

    public static void main(String[] args) throws IOException {
        int T = nextInt();
        while (T-- > 0) {
            int n = nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int temp = nextInt();
                map.put(temp,map.getOrDefault(temp,0) + 1);
            }
            int res = 0;
            for (int i = 1; i <= 50 ; i++) {
                if(map.get(i) != null){
                    int x = map.get(i);
                    if(map.get(2 * i) != null){
                        res += map.get(2 * i) * x;
                    }
                }
            }
            out.println(res);
        }

        out.flush();
        out.close();
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(in.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}


