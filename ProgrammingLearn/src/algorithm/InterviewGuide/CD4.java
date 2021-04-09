package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*10 10
        -8 -4 -3 0 1 2 4 5 8 9*/
public class CD4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int size = Integer.parseInt(str[0]);
        int target = Integer.parseInt(str[1]);
        str = reader.readLine().split(" ");
        reader.close();
        int[] arr = parse(str, size);
        for (int i = 0; i <= size - 3; i++) {
            getResult(arr,i,size - 1, target - arr[i]);
        }
    }

    private static void getResult(int[] arr, int start, int end, int k) {
        int i = start + 1, j = end - 1;
        while (i < j) {
            if (arr[i] + arr[j] == k) {
                if (i == 0 || arr[i] != arr[i - 1])
                    System.out.println(arr[start] + " " + arr[i] + " " + arr[j]);
                i++;
                j--;
            } else if (arr[i] + arr[j] > k) j--;
            else i++;
        }
    }

    private static int[] parse(String[] str, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }
}
