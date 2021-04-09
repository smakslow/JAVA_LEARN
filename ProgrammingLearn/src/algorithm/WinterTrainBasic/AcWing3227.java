package algorithm.WinterTrainBasic;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class AcWing3227 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        reader.close();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int left = arr[i] - arr[i - 1];
            int right = arr[i] - arr[i + 1];
            if ((left > 0 && right > 0) || (left < 0 && right < 0))
            res++;
        }
        System.out.println(res);
    }
}
