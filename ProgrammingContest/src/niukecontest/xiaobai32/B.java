package niukecontest.xiaobai32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class B {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");
    static Stack<Character> stack = new Stack<>();
    static Stack<Character> temp = new Stack<>();
    static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        int M = nextInt();
        int N = nextInt();
        for (int i = 0; i < M; i++) {
            map.put(next().toLowerCase().charAt(0), nextInt());
        }

        for (int i = 0; i < N; i++) {
            long res = 0;
            String str = next().toLowerCase();
            for (int j = 0; j < str.length(); j++) {
                stack.push(str.charAt(j));
            }
            while(!stack.isEmpty()){
                char c = stack.pop();
                if((c >= 'a' && c <= 'z') || c =='('){
                    temp.push(c);
                }
            }
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



