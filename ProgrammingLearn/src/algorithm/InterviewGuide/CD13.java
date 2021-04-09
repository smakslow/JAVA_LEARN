package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*5
        5 8 4 3 6*/
public class CD13 {
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        String[] str = reader.readLine().split(" ");
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() > num) {
                stack.add(num);
            } else {

            }
        }
        stack.sort(null);
    }
}
