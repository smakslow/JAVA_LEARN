package pat.basic;

import java.util.Scanner;

    /*6 2
            1 2 3 4 5 6
            Êä³öÑùÀı:
            5 6 1 2 3 4*/
    public class Pat1008 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            int[] newArr =  new int[n];
            for (int i = 0; i < n; ++i) {
                newArr[(i + k) % n] = arr[i];
            }
            System.arraycopy(newArr, 0, arr, 0, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

        }

    private static void reverse(int[] arr, int i, int n) {
        for (int j = i; j < n/2; j++) {
            arr[j] = arr[n - j -1];
        }
    }
}
