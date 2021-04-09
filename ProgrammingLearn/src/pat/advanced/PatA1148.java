package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Math.abs;

public class PatA1148 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                ArrayList<Integer> liars = new ArrayList<>();
                boolean[] isWolf = new boolean[n + 1];
                //假设i，j为狼人
                isWolf[i] = isWolf[j] = true;
                //枚举所有人的发言
                for (int k = 1; k <= n; k++) {
                    //如果当前发言人与假设矛盾，则说明此人说谎
                    boolean flag = isWolf[abs(arr[k])];
                    if ((flag && arr[k] > 0) ||
                            (!flag && arr[k] < 0)) {
                        liars.add(k);
                    }
                }
                //如果说谎的人 == 2 并且说谎者只有一个狼人
                if (liars.size() == 2 && isWolf[liars.get(0)] != isWolf[liars.get(1)]) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
            System.out.println("No Solution");
        }
    }
}
