package algorithm.WInterTrainAdvanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcWing1402 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int width = Integer.parseInt(reader.readLine());
        int height = Integer.parseInt(reader.readLine());
        char[][] arr = new char[height][width];
        String str;
        for (int i = 0; i < height; i++) {
            str = reader.readLine();
            for (int j = 0; j < width; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        reader.close();
    }
}
