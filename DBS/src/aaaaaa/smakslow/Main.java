package aaaaaa.smakslow;

import java.util.Scanner;

//读入 n（>0）名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
public class Main {
    class student {
        String name;
        String id;
        int score;

        public student(String name, String id, int score) {
            this.name = name;
            this.id = id;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        }
    }


}
