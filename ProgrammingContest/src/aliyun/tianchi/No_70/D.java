package aliyun.tianchi.No_70;

import java.util.HashSet;

public class D {
    public boolean isUnique(String str) {
        // a boolean
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(!set.add(str.charAt(i))) return false;
        }
        return true;
    }
}
