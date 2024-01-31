package important_sorting_techniques.sorting2;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        bubbleSort(arr,6);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr,int n){
        if(n == 1){
            return;  
        }
        boolean swapped = false;
        for(int j = 0; j<= n-2; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
            if(!swapped) break;
        }
        bubbleSort(arr,n-1);
    }

}
