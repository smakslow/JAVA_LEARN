package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PatA1057 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer tokenizer = new StringTokenizer("");
    private static Stack<Integer> stack = new Stack<>();
    private static List<Integer> min = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        String str;
        while (n-- > 0) { //Push key ,Pop, PeekMedian
            str = next();
            switch (str) {
                case "Push":
                    push(nextInt());
                    break;
                case "Pop":
                    pop();
                    break;
                case "PeekMedian":
                    peekMedian();
                    break;
            }
        }
    }

    private static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static void push(int num) {
        stack.push(num);
        min.add(search(num),num);
    }

    private static void pop() {
        if (stack.isEmpty()) {
            System.out.println("Invalid");
            return;
        }
        int num = stack.pop();
        min.remove(search(num));
        System.out.println(num);
    }

    private static void peekMedian() {
        if (stack.isEmpty()) {
            System.out.println("Invalid");
            return;
        }
        if ((min.size() & 1) == 1)
            System.out.println(min.get(min.size() >> 1));
        else
            System.out.println(min.get(min.size() - 1 >> 1));
    }
    //查找第一个大于等于给定元素的位置
    private static int search(int num){
        int low = 0, high = min.size() - 1,mid;
        while(low < high){
            mid = low + ( (high - low) >> 1);
            if(min.get(mid) <= num){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}
