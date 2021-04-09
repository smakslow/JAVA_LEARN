package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class PatA1063 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String[] s;
        int n,k;
        ArrayList<HashSet<Integer>> data = new ArrayList<>();
        HashSet<Integer> temp;
        while ((str = reader.readLine()) != null) {
            n = Integer.parseInt(str);
            for (int i = 0; i < n; i++) {
                s = reader.readLine().split(" ");
                temp =  new HashSet<>();
                for (int j = 1; j < s.length; j++) {
                    temp.add(Integer.parseInt(s[j]));
                }
                data.add(temp);
            }
            k = Integer.parseInt(reader.readLine());
            for (int j = 0; j < k; j++) {
                s = reader.readLine().split(" ");
                System.out.printf("%.1f%%\n",solution(data,Integer.parseInt(s[0]),Integer.parseInt(s[1])));
            }
        }
        reader.close();
    }

    private static double solution(ArrayList<HashSet<Integer>> data, int a,int b) {
        HashSet<Integer> set1 = data.get(a - 1);
        HashSet<Integer> set2  = data.get(b - 1);
        int same = 0,diff = set2.size() ;
        for(Integer num : set1){
            if(set2.contains(num)) same++;
            else diff++;
        }
        return (double)same/diff * 100;
    }
}
