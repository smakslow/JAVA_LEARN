package leetcode.daily;

public class Test {
    class TripleInOne {
        int[] st;
        int top1;
        int top2;
        int top3;
        int stackSize;

        public TripleInOne(int stackSize) {
            st = new int[stackSize * 3];
            this.stackSize = stackSize;
            top1 = -1;
            top2 = stackSize - 1;
            top3 = (stackSize << 1) - 2;
        }

        public void push(int stackNum, int value) {
            switch (stackNum) {
                case 1:
                    if (top1 < stackSize) {
                        st[++top1] = value;
                    }
                    break;
                case 2:
                    if (top2 < (stackSize << 1)) {
                        st[++top2] = value;
                    }
                    break;
                case 3:
                    if (top3 < (stackSize * 3)) {
                        st[++top3] = value;
                    }
                    break;
                default:
                    break;
            }
        }

        public int pop(int stackNum) {
            switch (stackNum) {
                case 1:
                    if (top1 > -1) {
                        return st[top1--];
                    }
                    return -1;
                case 2:
                    if (top2 > stackSize - 1) {
                        return st[top2--];
                    }
                    return -1;
                case 3:
                    if (top3 < ((stackSize << 1) - 2)) {
                        return st[top3--];
                    }
                    return -1;
                default:
                    break;
            }
            return -1;
        }

        public int peek(int stackNum) {
            switch (stackNum) {
                case 1:
                    if (top1 > -1) {
                        return st[top1];
                    }
                    return -1;
                case 2:
                    if (top2 > stackSize - 1) {
                        return st[top2];
                    }
                    return -1;
                case 3:
                    if (top3 < ((stackSize << 1) - 2)) {
                        return st[top3];
                    }
                    return -1;
                default:
                    break;
            }
            return -1;
        }

        public boolean isEmpty(int stackNum) {
            switch (stackNum) {
                case 1:
                    return top1 == -1;
                case 2:
                    return top2 == stackSize - 1;
                case 3:
                    return top3 == (stackSize << 1) - 2;
                default:
                    break;
            }
            return false;
        }
    }
}
