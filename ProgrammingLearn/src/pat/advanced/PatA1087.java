package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatA1087 {
    public static void main(String[] args) throws IOException {
        //第一行包含两个整数 N 和 K，分别表示总城市数量，城市之间道路数量，还包含一个城市名字，表示初始城市
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        String start = str[3];
        int[] add = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            add[i]= Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < K; i++) {

        }
    }
}
