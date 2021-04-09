package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1032 {
    static  int  N = 100005;
    static int[] address = new int[N];
    static char[] element = new char[N];
    static boolean[] b = new boolean[N];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[2]);
        int head1 = Integer.parseInt(str[0]);
        int head2 = Integer.parseInt(str[1]);
        for (int i = 0; i < n; i++) {
            str = reader.readLine().split(" ");
            int add = Integer.parseInt(str[0]);
            address[add] = Integer.parseInt(str[2]);
            element[add] = str[1].charAt(0);
        }
        while (head1 != -1) {
            b[head1] = true;
            head1 = address[head1];
        }
        while (head2 != -1) {
            if (b[head2]) {
                System.out.printf("%05d",head2);
                return;
            }
            head2 = address[head2];
        }
        System.out.println(-1);
    }
}
