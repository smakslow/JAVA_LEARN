package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PatA1039 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> temp;
        for (int i = 0; i < K; i++) {
            str = reader.readLine().split(" ");
            int course = Integer.parseInt(str[0]);
            int stuNum = Integer.parseInt(str[1]);
            str = reader.readLine().split(" ");
            for (int j = 0; j < stuNum; j++) {
                if(map.containsKey(str[j])){
                    temp = map.get(str[j]);
                    temp.add(course);
                    map.put(str[j],temp);
                }else{
                    temp = new ArrayList<>();
                    temp.add(course);
                    map.put(str[j],temp);
                }
            }
        }
        str = reader.readLine().split(" ");
        StringBuilder sb ;
        for (String s : str) {
            sb = new StringBuilder();
            temp = map.get(s);
            if(temp == null){
                sb.append(s).append(" ").append(0);
                System.out.println(sb.substring(0, sb.length() - 1));
                break;
            }
            Collections.sort(temp);
            sb.append(s).append(" ").append(temp.size()).append(" ");
            for (int num : temp) {
                sb.append(num).append(" ");
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
