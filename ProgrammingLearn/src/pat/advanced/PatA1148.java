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
                //����i��jΪ����
                isWolf[i] = isWolf[j] = true;
                //ö�������˵ķ���
                for (int k = 1; k <= n; k++) {
                    //�����ǰ�����������ì�ܣ���˵������˵��
                    boolean flag = isWolf[abs(arr[k])];
                    if ((flag && arr[k] > 0) ||
                            (!flag && arr[k] < 0)) {
                        liars.add(k);
                    }
                }
                //���˵�ѵ��� == 2 ����˵����ֻ��һ������
                if (liars.size() == 2 && isWolf[liars.get(0)] != isWolf[liars.get(1)]) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
            System.out.println("No Solution");
        }
    }
}
