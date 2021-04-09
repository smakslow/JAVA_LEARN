package algorithm.WinterTrainBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing420 {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            String[] str = reader.readLine().split(" ");
            int[] arr = new int[n + 2];
            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(str[i - 1]);
            }
            reader.close();
            while (m-- > 0) {
                int k = n;
                while (arr[k - 1] > arr[k]) k--;
                int t = k;
                while (arr[t + 1] > arr[k - 1]) t++;
                swap(arr, k - 1, t);
                reverse(arr, k, n);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                sb.append(arr[i] + " ");
            }
            System.out.println(sb.toString());
        }

        private static void reverse(int[] arr, int start, int end) {
            while (start < end){
                swap(arr,start++,end--);
            }
        }

        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
