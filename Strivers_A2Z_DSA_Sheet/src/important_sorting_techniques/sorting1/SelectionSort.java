package important_sorting_techniques.sorting1;

//This algorithm divides the array in sorted part and unsorted part,
//It says that, get the minimum and replace the first element of unsorted array with it.

//Get the minimum and swap it.

//Time Complexity = O(n)

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int [] selectionSort(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {      
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
