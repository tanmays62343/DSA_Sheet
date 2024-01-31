package important_sorting_techniques.sorting2;

import java.util.ArrayList;
import java.util.Arrays;

//First Divide then sort and then merge

//Time complexity O(n log n)

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        mergeSort(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr,int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    static void merge(int [] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        //Comparing and merging the elements of both right and left
        while (left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        //If there are remaining elements to the left
        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }
        //If there are remaining elements to the right
        while (right <= high){
            temp.add(arr[right]);
            right++;
        }
        //For transferring the elements form temp DS to our Array
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i-low);
        }
    }

}
