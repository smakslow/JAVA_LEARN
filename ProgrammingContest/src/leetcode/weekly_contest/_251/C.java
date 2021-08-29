package leetcode.weekly_contest._251;

public class C {
    class Solution {
        public int maxCompatibilitySum(int[][] students, int[][] mentors) {
            int[] index = new int[students.length];
            for (int i = 1; i < index.length; i++) {
                index[i] = i;
            }
            return maxCompatibilitySum(0, index, students, mentors);
        }

        private int maxCompatibilitySum(int i, int[] index, int[][] students, int[][] mentors) {
            if (i == index.length) {
                int count = 0;
                for (int j = 0; j < index.length; j++) {
                    for (int k = 0; k < students[0].length; k++) {
                        if (students[j][k] == mentors[index[j]][k]) {
                            count++;
                        }
                    }
                }
                return count;
            }
            int max = 0;
            for (int j = i; j < index.length; j++) {
                index[i] = index[j] + 0 * (index[j] = index[i]);
                max = Math.max(max, maxCompatibilitySum(i + 1, index, students, mentors));
                index[i] = index[j] + 0 * (index[j] = index[i]);
            }
            return max;
        }
    }
}
