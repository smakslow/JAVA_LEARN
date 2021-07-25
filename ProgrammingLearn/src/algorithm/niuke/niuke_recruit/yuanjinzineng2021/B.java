package algorithm.niuke.niuke_recruit.yuanjinzineng2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class B {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static Map<Character, Character> map = new HashMap<Character, Character>() {
        {
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }
    };
    public static void main(String[] args) throws IOException {
        String str;
        while ((str = in.readLine()) != null) {
            char[] chars = str.toCharArray();
            if(chars[0] == '"'){
                if(chars[chars.length - 1] == '"'){
                    out.println(judge(chars) ? "true" : "false");
                }
            }else out.println(judge(chars) ? "true" : "false");
        }
        out.flush();
        out.close();
    }

    private static boolean judge(char[] chars) {
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
