package algorithm.niuke.CSTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class ScoreSort {
    static class Student {
        String name;
        int socre;

        public Student(String name, int socre) {
            this.name = name;
            this.socre = socre;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int flag = Integer.parseInt(s[1]);
        Student[] students = new Student[n];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            s = reader.readLine().split(" ");
            students[i] = new Student(s[0], Integer.parseInt(s[1]));
        }
        reader.close();
        if (flag == 0) {
            Arrays.sort(students, (s1, s2) -> s2.socre - s1.socre);
        } else {
            Arrays.sort(students, Comparator.comparingInt(s2 -> s2.socre));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].socre);
        }
    }
}
