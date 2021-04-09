package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*5 0
        1 -2 1 1 1*/
public class CD9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[] arr = new int[N];
        str = reader.readLine().split(" ");
        reader.close();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        solution(arr,N,K);
    }

    private static void solution(int[] arr, int n, int k) {
        int[] res = new int[n];//前缀和数组
        for (int i = 0; i < n; i++) {
            res[i] += arr[i];
        }
        for (int i = 0; i < n; i++) {

        }
    }
}
