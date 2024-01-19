package important_sorting_techniques.sorting1;

//Bubble Sort pushes the biggest element at last by Comparing two Adjacent elements again and again

//Time Complexity is O(n^2)

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        System.out.println(Arrays.toString(bubbleSort_Front(arr)));
        //System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    //Simple (Two Pointer)
    static int [] bubbleSort(int [] arr){
        for(int i=arr.length-1; i>= 0; i--){
            for(int j=0; j< i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    //Easy To Understand
    static int [] bubbleSort_Front(int [] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    //Optimized Version (Two Pointer)
    static int [] bubbleSort_Optimized(int [] arr){
        for(int i=arr.length-1; i>= 0; i--){
            boolean swapped = false;
            for(int j=0; j< i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }

}
