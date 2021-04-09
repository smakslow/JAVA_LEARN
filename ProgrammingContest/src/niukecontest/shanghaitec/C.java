package niukecontest.shanghaitec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class C {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static int[] arr =new int[1001];
    public static void main(String[] args) throws IOException {
        int n = nextInt();
        for (int i = 1; i <= n; i++) {
            int sum = sum(next());
            arr[i] = sum;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        int temp = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                temp = entry.getKey();
            }
        }
        for (int i = 1; i <=n; i++) {
            if(arr[i] == temp){
                out.println(i);
                break;
            }
        }
        out.flush();
        out.close();
    }
    private static int sum(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        return sum;
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
