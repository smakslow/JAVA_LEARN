package aliyun.tianchi.No_62;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class C {
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
        HashSet<Integer> set1 = new HashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : set2) {
            if(set1.contains(num))  list.add(num);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
