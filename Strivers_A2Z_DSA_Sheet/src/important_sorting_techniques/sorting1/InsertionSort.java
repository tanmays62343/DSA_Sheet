package important_sorting_techniques.sorting1;

//Takes an element and insert it at its correct Position
//Like Arranging a hand of Cards

//Move i till end and compare j till 0

//Time Complexity O(n^2)

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
}
