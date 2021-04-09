package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CD105 {
    private static class Record {
        int value;
        int times;

        public Record(int value) {
            this.value = value;
            this.times = 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = parseArr(reader.readLine().split(" "), n);
        reader.close();
        System.out.println(getVisibleNum(arr));
    }

    private static int[] parseArr(String[] str, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    private static int getVisibleNum(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int size = arr.length;
        int maxIndex = 0;
        // 先在环中找到其中一个最大值的位置，哪一个都行
        for (int i = 0; i < size; i++) {
            maxIndex = arr[maxIndex] < arr[i] ? i : maxIndex;
        }
        Stack<Record> stack = new Stack<Record>();
        // 先把(最大值,1)这个记录放入 stack 中
        stack.push(new Record(arr[maxIndex]));
        // 从最大值位置的下一个位置开始沿 next 方向遍历
        int index = nextIndex(maxIndex, size);
        // 用“小找大”的方式统计所有可见山峰对
        int res = 0;
        // 遍历阶段开始，当 index 再次回到 maxIndex 的时候，说明转了一圈，遍历阶段就结束
        while (index != maxIndex) {
            // 当前数字 arr[index]要进栈，判断会不会破坏第一维的数字从顶到底依次变大
            // 如果破坏了，就依次弹出栈顶记录，并计算山峰对数量程序员代码面试指南： IT 名企算法与数据结构题目最优解（第 2 版）

            while (stack.peek().value < arr[index]) {
                int k = stack.pop().times;
                // 弹出记录为(X,K)，如果 K==1，产生 2 对
                // 如果 K>1，产生 2*K + C(2,K)对
                res += getInternalSum(k) + 2 * k;
            }
            // 当前数字 arr[index]要进入栈了，如果和当前栈顶数字一样就合并
            // 不一样就把记录(arr[index],1)放入栈中
            if (stack.peek().value == arr[index]) {
                stack.peek().times++;
            } else {
                stack.push(new Record(arr[index]));
            }
            index = nextIndex(index, size);
        }
        // 清算阶段开始
        // 清算阶段的第 1 小阶段
        while (stack.size() > 2) {
            int times = stack.pop().times;
            res += getInternalSum(times) + 2 * times;
        }
        // 清算阶段的第 2 小阶段
        if (stack.size() == 2) {
            int times = stack.pop().times;
            res += getInternalSum(times)
                    + (stack.peek().times == 1 ? times : 2 * times);
        }
        // 清算阶段的第 3 小阶段
        res += getInternalSum(stack.pop().times);
        return res;
    }

    // 如果 k==1， 返回 0； 如果 k>1， 返回 C(2,k)
    public static int getInternalSum(int k) {
        return k == 1 ? 0 : (k * (k - 1) / 2);
    }

    // 环形数组中当前位置为 i，数组长度为 size，返回 i 的下一个位置
    public  static int nextIndex(int i, int size) {
        return i < (size - 1) ? (i + 1) : 0;
    }
}
