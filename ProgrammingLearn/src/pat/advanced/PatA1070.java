package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PatA1070 {
    static class MoonCake {
        int save;
        int total;
        double price;

        public MoonCake(int save, int total) {
            this.save = save;
            this.total = total;
            this.price = total / save;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int d = Integer.parseInt(str[1]);
        String[] s1 = reader.readLine().split(" ");
        String[] s2 = reader.readLine().split(" ");
        MoonCake[] cake = new MoonCake[n];
        List<MoonCake> cakes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           cake[i] = new MoonCake(Integer.parseInt(s1[i]),Integer.parseInt(s2[i]));
        }
        cakes.sort((o1, o2) -> (int) (o1.price - o2.price));

        int res = 0;
        for (int i = n - 1; i >= 0 ; i--) {
            if(cake[i].save <= d){
                d -=cake[i].save;
                res+=cake[i].total;
            }else {
                res +=(cake[i].price * d);
                break;
            }
        }
        System.out.println(res);
    }
}
