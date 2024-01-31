package important_sorting_techniques.sorting2;
import java.util.Arrays;

//Pick a pivot and place it at its current place
//Pivot can be any element in the array

//After placing the pivot at its right place, do that again for the array on right and the array on left
//That is the difference between insertion sort and quick sort

//Time Complexity O(n log n) and takes less space i.e. O(1)+O(n)
//TODO : Not understood yet
public class QuickSort {

    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        quickSort(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int [] arr, int low, int high){
        if(low < high){
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    static int partition(int [] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while (arr[i]<=pivot && i<= high-1){
                i++;
            }
            while(arr[j] > pivot && j > low+1){
                j--;
            }
            //Sorting the pivot by swapping elements
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Swapping the pivot
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

}
