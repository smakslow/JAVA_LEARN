package aaaaaa.smakslow;

import aaaaaa.smakslow.sort.MergeSort;

import java.util.Arrays;
import java.util.Random;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = generateArr(1000, 10000);
        //BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        //InsertSort.sort(arr);
        //SelectSort.sort(arr);
        //ShellSort.shellSort(arr);
        //QuickSort.sort(arr,0,arr.length - 1);
        MergeSort.sort(arr,0,arr.length - 1);
        MergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));


        /*PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            heap.add(i);
        }
        System.out.println(heap.toString());*/

    }

    public static int[] generateArr(int n,int scope){
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0;i < n;i++)
            arr[i] = r.nextInt(scope);
        return  arr;
    }
}
