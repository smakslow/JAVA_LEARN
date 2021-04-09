package algorithm.AcWing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*但是有时一些数字和字母之间总是难以区分，比如 1（数字一）和 l（L 的小写），
0（数字零）和 O（o 的大写）。
 一种解决办法是将 1（数字一）替换为 @，将 0（数字零）替换为 %
        ，将 l（L 的小写）替换为 L，将 O（o 的大写）替换为 o。*/
public class AcWing1519 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str;
        ArrayList<String[]> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            str = reader.readLine().split(" ");
            char[] chars = str[1].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                switch (chars[j]) {
                    case '1':
                        chars[j] = '@';
                        break;
                    case '0':
                        chars[j] = '%';
                        break;
                    case 'l':
                        chars[j] = 'L';
                        break;
                    case 'O':
                        chars[j] = 'o';
                        break;
                }
            }
            String s = new String(chars);
            if (!s.equals(str[1])) {
                res.add(new String[]{str[0], s});
            }
        }
        if (res.isEmpty()) {
            if (n == 1)
                System.out.println("There is 1 account and no account is modified");
            else
                System.out.println("There are " + n + " accounts and no account is modified");
            return;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(res.size());
        str = res.get(0);
        builder.append("\n").append(str[0]).append(" ").append(str[1]);
        for (int i = 1; i < res.size(); i++) {
            str = res.get(i);
            builder.append("\n").append(str[0]).append(" ").append(str[1]);
        }
        System.out.println(builder);
    }
}
