package important_sorting_techniques.sorting2;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        insertionSort(arr,0);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int [] arr, int i){
        if(i== arr.length){
            return;
        }
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        insertionSort(arr,i+1);
    }

}
