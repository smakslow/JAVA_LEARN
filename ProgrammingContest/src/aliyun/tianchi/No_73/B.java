package aliyun.tianchi.No_73;

public class B {
    public static class Solution {
        /**
         * @param ratings: rating value of each child
         * @return: Return the minimum candies you must give.
         */
        public static int candy(int[] ratings) {
            // Write your code here
            int ans = 0;
            int last = -1;
            int cnt = 0;

            for (int rating : ratings) {
                if (rating > last) {
                    cnt++;
                    last = rating;
                } else if (rating == last) {

                } else {
                    cnt = 1;
                    last = rating;
                }
                ans += cnt;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int candy = Solution.candy(new int[]{4, 7, 8, 1, 6, 6, 2});
        System.out.println(candy);
    }
}
