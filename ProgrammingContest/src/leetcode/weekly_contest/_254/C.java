package leetcode.weekly_contest._254;

import java.math.BigInteger;

public class C {
    class Solution {
        int mod = 1000000007;

        public int minNonZeroProduct(int p) {
            long pow = pow(2, p);
            //就是一半1 一半 2^p-2 一个2^p-1
            long power = power(pow - 2, pow >> 1, mod);
            BigInteger a = new BigInteger(String.valueOf(power));
            BigInteger b = new BigInteger(String.valueOf((pow - 1)));

            return (int) a.multiply(b).mod(new BigInteger(String.valueOf(mod))).longValue();
        }

        long pow(long a, long b) {
            long ans = 1;
            while (b != 0) {
                if ((b & 1) == 1)
                    ans = ans * a;
                a = a * a;
                b >>= 1;
            }
            return ans;
        }

        long power(long a, long b, long p) {
            long ans = 1 % p;
            while (b != 0) {
                if ((b & 1) == 1)
                    ans = ans * a % p;
                a = a * a % p;
                b >>= 1;
            }
            return ans;
        }
    }

    public static void main(String[] args) {

    }
}
