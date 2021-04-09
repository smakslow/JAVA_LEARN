package algorithm.InterviewGuide;

public class CD31 {
    public static void main(String[] args) {

    }

    public int findLength(String A, String B) {
        if (A == null || A.length() == 0 || B == null || B.length() == 0)
            return 0;
        if (A.length() <= B.length())
            return findLength(B, A, B.length() + 1, A.length() + 1);
        return findLength(A, B, A.length() + 1, B.length() + 1);
    }

    private int findLength(String a, String b, int len1, int len2) {
        int[] dp = new int[len2];
        int max = 0;
        for (int i = 1; i < len1; i++) {
            for (int j = len2 - 1; j >= 1; j--) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[j] = dp[j - 1] + 1;
                    max = Math.max(max, dp[j]);
                } else dp[j] = 0;
            }
        }
        return max;
    }
}
