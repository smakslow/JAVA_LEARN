package algorithm.AcWing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*������ʱһЩ���ֺ���ĸ֮�������������֣����� 1������һ���� l��L ��Сд����
0�������㣩�� O��o �Ĵ�д����
 һ�ֽ���취�ǽ� 1������һ���滻Ϊ @���� 0�������㣩�滻Ϊ %
        ���� l��L ��Сд���滻Ϊ L���� O��o �Ĵ�д���滻Ϊ o��*/
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
