package AtCoder.AtCoderBeginnerContest._189;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] str = reader.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int limit = Integer.parseInt(str[1]);
            int sum = 0;
            int cnt = -1;
            for (int i = 0; i < n; i++) {
                str = reader.readLine().split(" ");
                int a = Integer.parseInt(str[0]);
                int b = Integer.parseInt(str[1]);
                sum += a * b;
                if(limit * 100 < sum){
                    cnt = i + 1;
                    break;
                }

            }
            System.out.println(cnt);
        }
    }
