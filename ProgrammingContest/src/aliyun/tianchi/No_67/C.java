package aliyun.tianchi.No_67;

public class C {
    public boolean detectCapitalUse(String word) {
        // write your code here
        char[] chars = word.toCharArray();
        int n = chars.length;
        int up = 0;
        int low = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(chars[i])) up++;
            else low++;
        }
        return up == n || low == n || (up == 1 && Character.isUpperCase(chars[0]));
    }
}
