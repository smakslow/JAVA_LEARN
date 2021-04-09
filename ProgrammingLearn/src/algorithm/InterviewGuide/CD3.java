package algorithm.InterviewGuide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
��Ŀ����
        ������������arr������k�����ظ���ӡarr��������Ӻ�Ϊk�Ĳ������Ԫ��
        ����, arr = [-8, -4, -3, 0, 1, 2, 4, 5, 8, 9], k = 10����ӡ���Ϊ��
        1, 9
        2, 8
        [Ҫ��]
        ʱ�临�Ӷ�ΪO(n)O(n)���ռ临�Ӷ�ΪO(1)O(1)
        ��������:
        ��һ������������n, k
        ������һ����n��������ʾ�����ڵ�Ԫ��
        �������:
        ��������У�ÿ������������ʾ��
        ����Ԫ���С�����˳�����(��Ԫ���С�ȽϷ�ʽΪÿ�����αȽ϶�Ԫ����ÿ����)
        ʾ��1
        ����
        ����
        10 10
        -8 -4 -3 0 1 2 4 5 8 9
        ���
        ����
        1 9
        2 8
*/

public class CD3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        str = reader.readLine().split(" ");
        reader.close();
        int[] arr = parse(str,n);
        int i = 0,j = n - 1;
        while(i < j){
            if(arr[i] + arr[j] == k){
                if(i==0 || arr[i] != arr[i - 1])
                    System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            } else if(arr[i] + arr[j] > k) j--;
            else i++;
        }
    }
    private static int[] parse(String[] str,int n){
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }
}
