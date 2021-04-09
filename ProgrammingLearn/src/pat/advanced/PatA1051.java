package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PatA1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int m = Integer.parseInt(str[0]);//栈的容量
        int n = Integer.parseInt(str[1]);//数字个数
        int k = Integer.parseInt(str[2]);//需要判断的序列个数。
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            int[] arr = parse(reader.readLine().split(" "), n);
            Stack<Integer> stack = new Stack<>();
            int index = 0;
            for (int j = 1; j <= n; j++) {
                stack.push(j);
                while (!stack.isEmpty() && stack.size() <= m && arr[index] == stack.peek()) {
                    stack.pop();
                    index++;
                }
                if(stack.size() > m) break;
            }
            if(stack.size() == 0){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb.substring(0,sb.length() - 1));
    }

    private static int[] parse(String[] str, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }
}
