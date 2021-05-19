package leetcode.weekly_contest._91;

public class A {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            switch (bill) {
                case 5:
                    five++;
                    break;
                case 10:
                    if (five == 0) return false;
                    ten++;
                    five--;
                    break;
                case 20:
                    if (five == 0) return false;
                    if (ten > 0) {
                        ten--;
                        five--;
                    } else if (five >= 3) five -= 3;
                    else return false;
                    break;
                default:
                    break;
            }
        }
        return true;
    }
}
