package aaaaaa.smakslow.sort;

public class SelectSort {
    public  static  void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int  k = i;
            for(int j = i; j < arr.length;j++){
                if(arr[j] < arr[k]){
                     k = j;
                }
            }
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i]  = temp;
        }
    }
}
