package AtCoder.AtCoderBeginnerContest._195;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        int m = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        System.out.println( h % m == 0 ? "Yes" : "No");
    }
}
