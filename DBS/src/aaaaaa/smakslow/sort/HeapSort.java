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
                j++; // 右孩子大于左孩子，j存储右孩子下标
            }
            if (arr[j] > arr[i]) { //如果孩子中权值大的比欲调整结点i大
                swap(arr,i,j); // 交换两结点位置
                i = j;       //更新欲调整结点下标
                j = j * 2 + 1;    //更新左孩子结点下标，向下迭代
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
