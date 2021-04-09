package aaaaaa.smakslow.sort;

import aaaaaa.smakslow.SortTest;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int n = 50;
        int[] arr = SortTest.generateArr(n, 100);
        System.out.println(Arrays.toString(arr));
        for (int i = n / 2 - 1 ;i  >= 0; i--) {
            downAdjust(arr,i, n );
        }

        System.out.println(Arrays.toString(arr));

    }


    private static void downAdjust(int[] arr, int low, int high) {
        int i = low, j = i * 2 + 1;
        while (j <= high) {
            if (j + 1 < high && arr[j + 1] > arr[j]) {
                j++; // �Һ��Ӵ������ӣ�j�洢�Һ����±�
            }
            if (arr[j] > arr[i]) { //���������Ȩֵ��ı����������i��
                swap(arr,i,j); // ���������λ��
                i = j;       //��������������±�
                j = j * 2 + 1;    //�������ӽ���±꣬���µ���
            } else {
                break;
            }
        }
    }

   private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
