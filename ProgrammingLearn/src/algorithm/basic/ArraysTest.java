package algorithm.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        String[] nums = s.split(" ");
        Arrays.sort(nums);
        int len = nums.length;
            for(int i= 0;i< len;i++){
                if(!nums[i].equals("0")) {
                    String temp = nums[0];
                    nums[0] = nums[i];
                    nums[i] = temp;
                    break;
                }
        }
        for(int i=0;i<len;i++){
            System.out.print(nums[i]);
        }
    }
}
