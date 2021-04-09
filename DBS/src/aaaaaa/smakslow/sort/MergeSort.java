package aaaaaa.smakslow.sort;

public class MergeSort {
    // 归并排序
    public static int[] sort(int[] arr, int left, int right) {
        // 如果 left == right，表示数组只有一个元素，则不用递归排序
        if (left < right) {
            // 把大的数组分隔成两个数组
            int mid = (left + right) / 2;
            // 对左半部分进行排序
            arr = sort(arr, left, mid);
            // 对右半部分进行排序
            arr = sort(arr, mid + 1, right);
            //进行合并
            //merge(arr, left, mid, right);
            mergeRec(arr, left, mid, right);
        }
        return arr;
    }

    // 合并函数，把两个有序的数组合并起来
    // arr[left..mif]表示一个数组，arr[mid+1 .. right]表示一个数组
    private static void merge(int[] arr, int left, int mid, int right) {
        //先用一个临时数组把他们合并汇总起来
        int[] a = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                a[k++] = arr[i++];
            } else {
                a[k++] = arr[j++];
            }
        }
        while (i <= mid) a[k++] = arr[i++];
        while (j <= right) a[k++] = arr[j++];
        // 把临时数组复制到原数组
        for (i = 0; i < k; i++) {
            arr[left++] = a[i];
        }
    }

    private static void mergeRec(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int index = 0;
        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }
        while (i <= mid) temp[index++] = arr[i++];
        while (j <= right) temp[index++] = arr[j++];
        for (i = 0; i < index; i++) {
            arr[left + i] = temp[i];
        }
    }

    /**
     * 非递归实现
     *
     * @param arr
     */
    public static void mergeSort(int[] arr) {
        for (int step = 2; step / 2 < arr.length; step *= 2) {
            for (int i = 0; i < arr.length; i += step) {
                int mid = i + step / 2;
                if (mid + 1 < arr.length) {
                    merge(arr, i, mid, Math.min(i + step, arr.length - 1));
                }
            }
        }
    }
}
