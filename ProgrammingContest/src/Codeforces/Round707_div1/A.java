package Codeforces.Round707_div1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class A {
    static int[] arr = new int[200010];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] s = reader.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(s[i - 1]);
        }
        HashMap<Integer, int[]> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = i  + 1; j <= n; j++) {
                int temp = arr[i] + arr[j];
                if(map.containsKey(temp) && !check(map.get(temp),i,j)){
                    System.out.println("YES");
                    int[] ints = map.get(temp);
                    sb.append(i).append(" ").append(j).append(" ").append(ints[0]).append(" ").append(ints[1]);
                    System.out.println(sb);
                    return;
                }
                map.put(temp,new int[]{i,j});
            }
        }
        System.out.println("No");
    }

    private static boolean check(int[] arr, int i, int j) {
        return arr[0] == i || arr[0] == j || arr[1] == i || arr[1] == j;
    }
}
