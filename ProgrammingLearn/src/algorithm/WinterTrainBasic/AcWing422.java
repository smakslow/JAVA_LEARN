package algorithm.WinterTrainBasic;

import java.io.*;
import java.util.Arrays;
public class AcWing422 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int L = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] arr = new int[L + 1];
        Arrays.fill(arr,1);
        while(M-- > 0){
            str = reader.readLine().split(" ");
            L = Integer.parseInt(str[0]);
            M = Integer.parseInt(str[1]);
            for(int i = L;i <= M; ++i ){
                arr[i] = 0;
            }
        }
        int res = 0;
        for(int i = 0; i <= arr.length;++i){
            res = res +  arr[i];
        }
        System.out.println(res);
    }
}
