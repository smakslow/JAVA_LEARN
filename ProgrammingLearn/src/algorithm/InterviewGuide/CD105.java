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
        // ���ڻ����ҵ�����һ�����ֵ��λ�ã���һ������
        for (int i = 0; i < size; i++) {
            maxIndex = arr[maxIndex] < arr[i] ? i : maxIndex;
        }
        Stack<Record> stack = new Stack<Record>();
        // �Ȱ�(���ֵ,1)�����¼���� stack ��
        stack.push(new Record(arr[maxIndex]));
        // �����ֵλ�õ���һ��λ�ÿ�ʼ�� next �������
        int index = nextIndex(maxIndex, size);
        // �á�С�Ҵ󡱵ķ�ʽͳ�����пɼ�ɽ���
        int res = 0;
        // �����׶ο�ʼ���� index �ٴλص� maxIndex ��ʱ��˵��ת��һȦ�������׶ξͽ���
        while (index != maxIndex) {
            // ��ǰ���� arr[index]Ҫ��ջ���жϻ᲻���ƻ���һά�����ִӶ��������α��
            // ����ƻ��ˣ������ε���ջ����¼��������ɽ�����������Ա��������ָ�ϣ� IT �����㷨�����ݽṹ��Ŀ���Ž⣨�� 2 �棩

            while (stack.peek().value < arr[index]) {
                int k = stack.pop().times;
                // ������¼Ϊ(X,K)����� K==1������ 2 ��
                // ��� K>1������ 2*K + LCP41(2,K)��
                res += getInternalSum(k) + 2 * k;
            }
            // ��ǰ���� arr[index]Ҫ����ջ�ˣ�����͵�ǰջ������һ���ͺϲ�
            // ��һ���ͰѼ�¼(arr[index],1)����ջ��
            if (stack.peek().value == arr[index]) {
                stack.peek().times++;
            } else {
                stack.push(new Record(arr[index]));
            }
            index = nextIndex(index, size);
        }
        // ����׶ο�ʼ
        // ����׶εĵ� 1 С�׶�
        while (stack.size() > 2) {
            int times = stack.pop().times;
            res += getInternalSum(times) + 2 * times;
        }
        // ����׶εĵ� 2 С�׶�
        if (stack.size() == 2) {
            int times = stack.pop().times;
            res += getInternalSum(times)
                    + (stack.peek().times == 1 ? times : 2 * times);
        }
        // ����׶εĵ� 3 С�׶�
        res += getInternalSum(stack.pop().times);
        return res;
    }

    // ��� k==1�� ���� 0�� ��� k>1�� ���� LCP41(2,k)
    public static int getInternalSum(int k) {
        return k == 1 ? 0 : (k * (k - 1) / 2);
    }

    // ���������е�ǰλ��Ϊ i�����鳤��Ϊ size������ i ����һ��λ��
    public  static int nextIndex(int i, int size) {
        return i < (size - 1) ? (i + 1) : 0;
    }
}
