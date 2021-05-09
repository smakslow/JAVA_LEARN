package leetcode.weekly_contest._89;

import java.util.TreeSet;

public class C {
    class ExamRoom {
        int N;
        TreeSet<Integer> students;

        public ExamRoom(int N) {
            this.N = N;
            students = new TreeSet<>();
        }

        public int seat() {
            int student = 0;
            if (students.size() > 0) {
                int dist = students.first();
                Integer prev = null;
                for (Integer s : students) {
                    if (prev != null) {
                        int d = (s - prev) >> 1;
                        if (d > dist) {
                            dist = d;
                            student = prev + d;
                        }
                    }
                    prev = s;
                }
                if (N - 1 - students.last() > dist)
                    student = N - 1;
            }
            students.add(student);
            return student;
        }

        public void leave(int p) {
            students.remove(p);
        }
    }

}
