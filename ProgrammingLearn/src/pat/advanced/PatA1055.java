package pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PatA1055 {
    static class Person {
        String name;
        int age;
        int pro;

        Person(String name, int age, int pro) {
            this.name = name;
            this.age = age;
            this.pro = pro;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        Person[] data = new Person[n];
        for (int i = 0; i < n; i++) {
            str = reader.readLine().split(" ");
            data[i] = new Person(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]));
        }
        Arrays.sort(data, (o1, o2) -> {
            if (o1.pro == o2.pro) {
                if (o1.age == o2.age) {
                    return o1.name.compareTo(o2.name);
                }
                return o1.age - o2.age;
            }
            return o2.pro - o1.pro;
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            str = reader.readLine().split(" ");
            int line = Integer.parseInt(str[0]);
            int small = Integer.parseInt(str[1]);
            int large = Integer.parseInt(str[2]);
            sb.append("Case #").append(i).append(":").append("\n");
            int k = 0;
            for (int j = 0; j < n; j++) {
                if (data[j].age >= small && data[j].age <= large) {
                    sb.append(data[j].name).append(" ").append(data[j].age).append(" ").append(data[j].pro).append("\n");
                    k++;
                    if (k == line) break;
                }
            }
            if (k == 0) sb.append("None").append("\n");
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
